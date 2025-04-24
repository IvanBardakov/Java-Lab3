package Task5;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        Circle[] circles = {
                new Circle(5.0),
                new Circle(2.5),
                new Circle(7.1),
                new Circle(3.3)
        };

        Arrays.sort(circles);

        for (Circle c : circles) {
            System.out.println(c);
        }
    }
}
