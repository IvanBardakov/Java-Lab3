package Task7;

public class TrapezoidIntegrable implements Integrable {
    private final Integrable function;

    public TrapezoidIntegrable(Integrable function) {
        this.function = function;
    }

    @Override
    public double apply(double x) {
        return function.apply(x);
    }

    @Override
    public double integral(double a, double b, double precision) {
        int n = (int) ((b - a) / precision);
        double sum = 0.5 * (apply(a) + apply(b));
        for (int i = 1; i < n; i++) {
            double x = a + i * precision;
            sum += apply(x);
        }
        return sum * precision;
    }

}
