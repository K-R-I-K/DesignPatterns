package my.observer.git;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class GitRepoObservers {

    public static Repository newRepository(){
        return new Repository() {
            List<WebHook> branches = new ArrayList<>();
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
                target.caughtEvents().stream().map(Event::commits).forEach(commits -> temp.addAll(commits));
                mergeCommit.removeAll(temp);

                merge.caughtEvents().add(new Event(Event.Type.MERGE,targetBranch,mergeCommit));
            }
        };
    }

    public static WebHook mergeToBranchWebHook(String branchName){
        return new WebHook() {
            List<Event> events = new ArrayList<>();
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

    public static WebHook commitToBranchWebHook(String branchName){
        return new WebHook() {
            List<Event> events = new ArrayList<>();
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
