package Task1;

/**
 * Utility class for printing weather-related information in a formatted and human-readable way.
 * This class provides static methods to print {@link AbstractWeather} data and arrays of {@link Day} objects
 * in a table-like format.
 */
public class WeatherPrinter {

    /**
     * Prints a full weather report for the given {@link AbstractWeather} object, including season,
     * comment, and all associated days with their respective temperatures and comments.
     *
     * @param weather the {@link AbstractWeather} object to print
     */
    public static void printWeather(AbstractWeather weather) {
        System.out.println("=== Weather Report ===");
        System.out.println("Season: " + weather.getSeason());
        System.out.println("Comment: " + weather.getComment());
        System.out.println("-- Days --");
        for (Day day : weather.getDays()) {
            System.out.printf("  %-12s | %5.1f°C | %s%n",
                    day.getDate(),
                    day.getTemperature(),
                    day.getComment());
        }
        System.out.println();
    }

    /**
     * Prints an array of {@link Day} objects in a table-like format, sorted according to some criteria.
     * A custom header is printed to indicate the sorting strategy.
     *
     * @param days   the array of {@link Day} objects to print
     * @param header the description or title of the sorting strategy
     */
    public static void printSortedDays(Day[] days, String header) {
        System.out.println("-- " + header + " --");
        for (Day d : days) {
            System.out.printf("  %-12s | %5.1f°C | %s%n",
                    d.getDate(),
                    d.getTemperature(),
                    d.getComment());
        }
        System.out.println();
    }
}
