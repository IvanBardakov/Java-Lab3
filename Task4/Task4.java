package Task4;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Тестування ArrayOfPoints2D (двовимірний масив):");
        AbstractArrayOfPoints points2D = new ArrayOfPoints2D();
        points2D.test();

        System.out.println("Тестування ArrayOfPoints1D (одновимірний масив):");
        AbstractArrayOfPoints points1D = new ArrayOfPoints1D();
        points1D.test();
    }
}
