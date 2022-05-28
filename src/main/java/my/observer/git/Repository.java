package my.observer.git;

/**
 * It's interface that represent our repository (Publisher of Observer pattern).
 */
public interface Repository {
    /**
     * Method that add webhook to our repository.
     * @param webHook WebHook to add.
     */
    void addWebHook(WebHook webHook);

    /**
     * Method that make commit to our repository.
     * @param branch Branch in which we commit.
     * @param author Author of commit.
     * @param changes List of String that represent changes in this commit.
     * @return Our commit.
     */
    Commit commit(String branch, String author, String[] changes);

    /**
     * Method to merge 2 branches.
     * @param sourceBranch source branch of merge.
     * @param targetBranch target branch in which we merge branches.
     */
    void merge(String sourceBranch, String targetBranch);

}
