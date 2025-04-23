package Task1;

import java.util.List;

/**
 * A utility class providing helper methods for searching and analyzing {@link Day} elements
 * within a weather sequence represented by an {@link AbstractWeather} object.
 */
public class SearchUtils {

    /**
     * Calculates the average temperature of the days in the given weather sequence.
     * If the sequence is empty, it returns {@code Double.NaN}.
     *
     * @param w the weather sequence to calculate the average temperature for
     * @return the average temperature of the days, or {@code Double.NaN} if the sequence is empty
     */
    public static double averageTemperature(AbstractWeather w) {
        Day[] days = w.getDays();
        if (days.length == 0) return Double.NaN;

        double sum = 0;
        for (Day d : days) sum += d.getTemperature();
        return sum / days.length;
    }

    /**
     * Finds and returns the {@link Day} with the highest temperature from the given weather sequence.
     * If the sequence is empty, it returns {@code null}.
     *
     * @param w the weather sequence to find the day with the maximum temperature in
     * @return the {@link Day} with the highest temperature, or {@code null} if the sequence is empty
     */
    public static Day dayWithMaxTemperature(AbstractWeather w) {
        Day[] days = w.getDays();
        if (days.length == 0) return null;

        Day maxDay = days[0];
        for (Day d : days) {
            if (d.getTemperature() > maxDay.getTemperature()) maxDay = d;
        }
        return maxDay;
    }

    /**
     * Finds and returns the {@link Day} with the longest comment from the given weather sequence.
     * If the sequence is empty, it returns {@code null}.
     *
     * @param w the weather sequence to find the day with the longest comment in
     * @return the {@link Day} with the longest comment, or {@code null} if the sequence is empty
     */
    public static Day dayWithLongestComment(AbstractWeather w) {
        Day[] days = w.getDays();
        if (days.length == 0) return null;

        Day longestCommentDay = days[0];
        for (Day d : days) {
            if (d.getComment().length() > longestCommentDay.getComment().length()) {
                longestCommentDay = d;
            }
        }
        return longestCommentDay;
    }
}
