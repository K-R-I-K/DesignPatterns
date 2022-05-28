package my.observer.git;

import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * Class that represent commit in our branches and repository.
 */
public class Commit{
    private final String author;
    private final String[] changes;

    /**
     * Constructor of commit class
     * @param author String object which represent author of commit.
     * @param changes Array of String objects which represent changes in commit.
     */
    public Commit(final String author, final String[] changes) {
        this.author = author;
        this.changes = changes;
    }

    /**
     * Overriding of equals() method.
     * @param o object to compare
     * @return True if objects are equal. And false in another.
     */
    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Commit commit = (Commit) o;

        if (!Objects.equals(author, commit.author)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(changes, commit.changes);
    }

    /**
     * Overriding of hashCode() method.
     * @return hash code of this object.
     */
    @Override
    public int hashCode() {
        int result = author != null ? author.hashCode() : 0;
        result = 31 * result + Arrays.hashCode(changes);
        return result;
    }

    /**
     * Overriding of toString() method.
     * @return string that represent this object.
     */
    @Override
    public String toString() {
        return new StringJoiner(", ", Commit.class.getSimpleName() + "[", "]")
                .add(author)
                .add(Arrays.toString(changes))
                .toString();
    }
}
