package my.observer.git;

import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * Class that represent event in our repository.
 */
public class Event {
    /**
     * Type of event
     */
    private final Type type;
    /**
     * Name of branch in which happens this event.
     */
    private final String branch;
    /**
     * List of commits which represent this event.
     */
    private final List<Commit> commits;

    /**
     * Constructor of Event class.
     * @param type Type of event.
     * @param branch Branch of event.
     * @param commits List of commits.
     */
    public Event(final Type type, final String branch, final List<Commit> commits) {
        this.type = type;
        this.branch = branch;
        this.commits = commits;
    }

    /**
     * Getter to list of commits.
     * @return return list of commits.
     */
    List<Commit> commits() {
        return commits;
    }

    /**
     * Overriding of equals method.
     * @param o object to compare.
     * @return True if objects are equal. And false in another.
     */
    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Event event = (Event) o;

        if (type != event.type) return false;
        if (!Objects.equals(branch, event.branch)) return false;
        return Objects.equals(commits, event.commits);
    }

    /**
     * Overriding of hashCode() method.
            * @return hash code of this object.
     */
    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (branch != null ? branch.hashCode() : 0);
        result = 31 * result + (commits != null ? commits.hashCode() : 0);
        return result;
    }

    /**
     * Enum that represent type of event.
     */
    enum Type {
        COMMIT,
        MERGE
    }

    /**
     * Overriding of toString() method.
     * @return string that represent this object.
     */
    @Override
    public String toString() {
        return new StringJoiner(", ", Event.class.getSimpleName() + "[", "]")
                .add(type.toString())
                .add(branch)
                .add(commits.toString())
                .toString();
    }
}
