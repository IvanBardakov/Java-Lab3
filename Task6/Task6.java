package Task6;

import java.util.Arrays;
import java.util.Comparator;

public class Task6 {
    public static void main(String[] args) {
        Triangle[] triangles = {
                new Triangle(3, 4, 5),
                new Triangle(5, 5, 6),
                new Triangle(6, 7, 8),
                new Triangle(2, 2, 3)
        };

        Arrays.sort(triangles, new Comparator<Triangle>() {
            @Override
            public int compare(Triangle t1, Triangle t2) {
                return Double.compare(t2.getArea(), t1.getArea()); // Зменшення
            }
        });

        for (Triangle t : triangles) {
            System.out.println(t);
        }
    }
}
