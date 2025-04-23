package Task1;

import java.util.Arrays;

/**
 * A concrete implementation of {@link AbstractWeather} that stores the weather sequence in an array.
 * This class encapsulates an array of {@link Day} objects and provides methods to access and modify them safely.
 */
public class ArrayWeather extends AbstractWeather {
    /** The array of Day objects representing the weather sequence. */
    private Day[] days;

    /**
     * Constructs an ArrayWeather instance with the specified season, comment, and array of days.
     * A defensive copy of the input array is made to preserve encapsulation.
     *
     * @param season the season associated with the weather data
     * @param comment a descriptive comment about the weather
     * @param days an array of {@link Day} objects representing the weather sequence
     */
    public ArrayWeather(String season, String comment, Day[] days) {
        super(season, comment);
        this.days = Arrays.copyOf(days, days.length);
    }

    /**
     * Returns a copy of the array of Day objects.
     * This ensures that the internal array cannot be modified externally.
     *
     * @return a copy of the array of {@link Day} objects
     */
    @Override
    public Day[] getDays() {
        return Arrays.copyOf(days, days.length);
    }

    /**
     * Sets the array of Day objects to a new array.
     * A defensive copy is created to maintain encapsulation.
     *
     * @param days the new array of {@link Day} objects to store
     */
    @Override
    public void setDays(Day[] days) {
        this.days = Arrays.copyOf(days, days.length);
    }
}
