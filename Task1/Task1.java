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
        Day[] days = new Day[]{
                new Day(LocalDate.of(2025, 7, 1), 25.0, "Sunny day"),
                new Day(LocalDate.of(2025, 7, 2), 28.0, "Hot and humid"),
                new Day(LocalDate.of(2025, 7, 3), 22.0, "Cloudy with a chance of rain"),
                new Day(LocalDate.of(2025, 7, 4), 20.0, "Light rain")
        };

        ArrayWeather aw = new ArrayWeather("Summer", "Hot and Sunny", days);
        WeatherPrinter.printWeather(aw);

        LinkedListWeather lw = new LinkedListWeather("Summer", "Hot and Sunny");
        lw.setDays(days);
        WeatherPrinter.printWeather(lw);

        System.out.println("Average temperature: " + SearchUtils.averageTemperature(aw));
        System.out.println("Day with max temperature: " + SearchUtils.dayWithMaxTemperature(lw));
        System.out.println("Day with longest comment: " + SearchUtils.dayWithLongestComment(aw));
        System.out.println();

        Day[] arr = aw.getDays();
        Arrays.sort(arr);
        WeatherPrinter.printSortedDays(arr, "Sorted by temperature desc");

        Arrays.sort(arr, new CommentComparator());
        WeatherPrinter.printSortedDays(arr, "Sorted by comment");
    }
}
