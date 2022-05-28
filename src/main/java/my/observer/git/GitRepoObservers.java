package my.observer.git;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class that implements method that create Repository and methods to merge and commit branches.
 * It lets define a subscription mechanism to notify multiple objects about any events that happen with the object they’re observing.
 */
public class GitRepoObservers {

    /**
     * Method that create Repository.
     * It supports commits to various branches and merges between branches.
     * Also, it supports WebHooks - observers that observes commit or merge events.
     * @return It's Repository with implementation of its methods.
     */
    public static Repository newRepository(){
        return new Repository() {
            final List<WebHook> branches = new ArrayList<>();
            @Override
            public void addWebHook(WebHook webHook) {
                branches.add(webHook);
            }

            @Override
            public Commit commit(String branch, String author, String[] changes) {
                Commit com = new Commit(author, changes);
                if(branches.stream().filter(webHook -> webHook.type() == Event.Type.COMMIT)
                        .noneMatch(webHook -> webHook.branch().equals(branch)))
                    return com;
                branches.stream().filter(webHook -> webHook.type() == Event.Type.COMMIT)
                        .filter(webHook -> webHook.branch().equals(branch))
                        .forEach(webHook -> webHook.onEvent(new Event(Event.Type.COMMIT, branch, Collections.singletonList(com))));
                return com;
            }

            @SuppressWarnings("OptionalGetWithoutIsPresent")
            @Override
            public void merge(String sourceBranch, String targetBranch) {
                if(branches.stream().filter(webHook -> webHook.type() == Event.Type.MERGE).noneMatch(webHook -> webHook.branch().equals(targetBranch))){
                    return;
                }
                if(branches.stream().filter(webHook -> webHook.type() == Event.Type.COMMIT).noneMatch(webHook -> webHook.branch().equals(sourceBranch))){
                    return;
                }
                if(branches.stream().filter(webHook -> webHook.type() == Event.Type.COMMIT).noneMatch(webHook -> webHook.branch().equals(targetBranch))){
                    return;
                }

                WebHook target = branches.stream()
                        .filter(webHook -> webHook.type() == Event.Type.COMMIT)
                        .filter(webHook -> webHook.branch().equals(targetBranch))
                        .findFirst().get();
                WebHook source = branches.stream()
                        .filter(webHook -> webHook.type() == Event.Type.COMMIT)
                        .filter(webHook -> webHook.branch().equals(sourceBranch))
                        .findFirst().get();
                WebHook merge = branches.stream()
                        .filter(webHook -> webHook.type() == Event.Type.MERGE)
                        .filter(webHook -> webHook.branch().equals(targetBranch))
                        .findFirst().get();

                merge.caughtEvents().clear();
                List<Commit> mergeCommit = new ArrayList<>();

                target.caughtEvents().stream().map(Event::commits).forEach(mergeCommit::addAll);
                source.caughtEvents().stream().map(Event::commits).forEach(mergeCommit::addAll);
                mergeCommit = mergeCommit.stream().distinct().collect(Collectors.toList());
                merge.caughtEvents().stream().map(Event::commits).forEach(mergeCommit::addAll);
                mergeCommit = mergeCommit.stream().distinct().collect(Collectors.toList());

                List<Commit> temp = new ArrayList<>();
                target.caughtEvents().stream().map(Event::commits).forEach(temp::addAll);
                mergeCommit.removeAll(temp);

                merge.caughtEvents().add(new Event(Event.Type.MERGE,targetBranch,mergeCommit));
            }
        };
    }

    /**
     * Method that returns a WebHook that observes merge events for a target branch.
     * @param branchName branch to merge.
     * @return updated webhook after merge.
     */
    public static WebHook mergeToBranchWebHook(String branchName){
        return new WebHook() {
            final List<Event> events = new ArrayList<>();
            @Override
            public String branch() {
                return branchName;
            }

            @Override
            public Event.Type type() {
                return Event.Type.MERGE;
            }

            @Override
            public List<Event> caughtEvents() {
                return events;
            }

            @Override
            public void onEvent(Event event) {
                events.add(event);
            }
        };
    }

    /**
     * Method that returns a WebHook that observes commit events for a target branch.
     * @param branchName branch to commit.
     * @return updated webhook after commit.
     */
    public static WebHook commitToBranchWebHook(String branchName){
        return new WebHook() {
            final List<Event> events = new ArrayList<>();
            @Override
            public String branch() {
                return branchName;
            }

            @Override
            public Event.Type type() {
                return Event.Type.COMMIT;
            }

            @Override
            public List<Event> caughtEvents() {
                return events;
            }

            @Override
            public void onEvent(Event event) {
                events.add(event);
            }
        };
    }


}
