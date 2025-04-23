package Task1;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * A main class for demonstrating the functionality of weather data management.
 * It shows the usage of various weather data structures like {@link ArrayWeather} and {@link LinkedListWeather}.
 * The class also demonstrates how to calculate the average temperature and find specific days using utilities like
 * {@link SearchUtils} and sorting the days by temperature and comment.
 */
public class Task1 {
    /**
     * The entry point of the program. This method demonstrates the creation of weather data,
     * and showcases sorting, searching, and displaying weather information using different implementations.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create an array of Day objects representing weather data for several days.
        Day[] days = new Day[] {
                new Day(LocalDate.of(2025, 7, 1), 25.0, "Sunny day"),
                new Day(LocalDate.of(2025, 7, 2), 28.0, "Hot and humid"),
                new Day(LocalDate.of(2025, 7, 3), 22.0, "Cloudy with a chance of rain"),
                new Day(LocalDate.of(2025, 7, 4), 20.0, "Light rain")
        };

        // Create an ArrayWeather instance with a predefined weather sequence.
        ArrayWeather aw = new ArrayWeather("Summer", "Hot and Sunny", days);
        System.out.println("-- ArrayWeather --");
        System.out.println(aw);

        // Create a LinkedListWeather instance and set the weather sequence.
        LinkedListWeather lw = new LinkedListWeather("Summer", "Hot and Sunny");
        lw.setDays(days);

        // Use SearchUtils to calculate average temperature, find the day with max temperature,
        // and find the day with the longest comment.
        System.out.println("Average temperature: " + SearchUtils.averageTemperature(aw));
        System.out.println("Day with max temperature: " + SearchUtils.dayWithMaxTemperature(lw));
        System.out.println("Day with longest comment: " + SearchUtils.dayWithLongestComment(aw));
        System.out.println();

        // Retrieve the days from the ArrayWeather and sort them by temperature in descending order.
        Day[] arr = aw.getDays();
        Arrays.sort(arr);
        System.out.println("-- Sorted by temperature desc --");
        for (Day d : arr) System.out.println(d);

        // Sort the days by comment using CommentComparator.
        Arrays.sort(arr, new CommentComparator());
        System.out.println("-- Sorted by comment --");
        for (Day d : arr) System.out.println(d);
    }
}
