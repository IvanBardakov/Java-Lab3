package Task6;

public class Triangle {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public double getArea() {
        double sum = a + b + c;
        return 0.25 * Math.sqrt((sum) * (b + c - a) * (a + c - b) * (a + b - c)
        );
    }

    @Override
    public String toString() {
        return String.format("Triangle{a=%.2f, b=%.2f, c=%.2f, area=%.2f}", a, b, c, getArea());
    }
}
