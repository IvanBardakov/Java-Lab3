package Task1;

import java.util.Objects;

/**
 * Represents weather data for a season using a singly linked list to store {@link Day} elements.
 * This class allows adding days, retrieving all days as an array, and modifying the days.
 */
public class LinkedListWeather extends AbstractWeather {

    /**
     * The head node of the singly linked list storing the days.
     */
    private Node head;

    /**
     * A helper class representing a node in the singly linked list.
     * Each node stores a {@link Day} and a reference to the next node.
     */
    private static class Node {
        Day day;      // The weather data for the day
        Node next;    // The next node in the list

        /**
         * Constructs a node with a specified {@link Day}.
         *
         * @param day the {@link Day} to store in this node
         */
        Node(Day day) {
            this.day = day;
        }
    }

    /**
     * Constructs a new {@code LinkedListWeather} object with the specified season and comment.
     * The linked list for storing days is initially empty.
     *
     * @param season  the season associated with the weather data
     * @param comment a comment or description about the weather
     */
    public LinkedListWeather(String season, String comment) {
        super(season, comment);
    }

    /**
     * Adds a new {@link Day} to the linked list of days.
     * The day is added at the end of the list.
     *
     * @param day the {@link Day} to add to the weather data
     */
    public void addDay(Day day) {
        Node newNode = new Node(day);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }

    /**
     * Returns an array of {@link Day} objects representing all the days in this weather data.
     * The days are retrieved in the order they were added to the linked list.
     *
     * @return an array containing all the {@link Day} objects in this linked list
     */
    @Override
    public Day[] getDays() {
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }

        Day[] daysArray = new Day[size];
        current = head;
        for (int i = 0; i < size; i++) {
            daysArray[i] = current.day;
            current = current.next;
        }

        return daysArray;
    }

    /**
     * Sets the days in this weather data by replacing the existing linked list of days
     * with a new list constructed from the provided array of {@link Day} objects.
     *
     * @param days an array of {@link Day} objects to replace the current days
     */
    @Override
    public void setDays(Day[] days) {
        head = null; // Clears the existing list
        if (days != null) {
            for (Day day : days) {
                addDay(day); // Adds each day to the linked list
            }
        }
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * Two {@code LinkedListWeather} objects are considered equal if they have the same season,
     * comment, and the same list of days (in the same order).
     *
     * @param obj the object to compare with
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof LinkedListWeather other)) return false;
        return Objects.equals(getSeason(), other.getSeason()) &&
                Objects.equals(getComment(), other.getComment()) &&
                Objects.deepEquals(getDays(), other.getDays());
    }
    
}
