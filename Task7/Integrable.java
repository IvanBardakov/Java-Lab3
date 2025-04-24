package Task7;

public interface Integrable {
    double apply(double x);

    default double integral(double a, double b, double precision) {
        int n = (int) ((b - a) / precision);
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            double x = a + i * precision;
            sum += apply(x) * precision;
        }
        return sum;
    }
}
