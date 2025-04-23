package Task3;

public class MinimumFinder {
    static double findMinimum(FunctionInterface f, double a, double b, double h) {
        double min = f.evaluate(a);
        for (double x = a; x <= b; x += h) {
            double value = f.evaluate(x);
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
