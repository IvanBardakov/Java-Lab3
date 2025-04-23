package Task1;

import java.util.Comparator;

/**
 * A comparator for comparing {@link Day} objects based on their comments.
 * It performs a lexicographical comparison of the comment strings.
 */
public class CommentComparator implements Comparator<Day> {

    /**
     * Compares two {@link Day} objects based on the lexicographical order of their comments.
     *
     * @param d1 the first {@link Day} object to compare
     * @param d2 the second {@link Day} object to compare
     * @return a negative integer, zero, or a positive integer as the comment of {@code d1}
     *         is less than, equal to, or greater than the comment of {@code d2}
     */
    @Override
    public int compare(Day d1, Day d2) {
        return d1.getComment().compareTo(d2.getComment());
    }
}
