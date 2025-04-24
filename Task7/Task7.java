package Task7;

public class Task7 {
    public static void main(String[] args) {
        double a = 0;
        double b = Math.PI;
        double precision = 0.01;

        Integrable sinFunc = Math::sin;
        TrapezoidIntegrable sinTrap = new TrapezoidIntegrable(sinFunc);

        System.out.println("sin(x) rectangle: " + sinFunc.integral(a, b, precision));
        System.out.println("sin(x) trapezoid:     " + sinTrap.integral(a, b, precision));

        Integrable logFunc = Math::log;
        TrapezoidIntegrable logTrap = new TrapezoidIntegrable(logFunc);

        System.out.println("log(x) rectangle: " + logFunc.integral(1, 5, precision));
        System.out.println("log(x) trapezoid:     " + logTrap.integral(1, 5, precision));

        Integrable expFunc = Math::exp;
        TrapezoidIntegrable expTrap = new TrapezoidIntegrable(expFunc);

        System.out.println("exp(x) rectangle: " + expFunc.integral(0, 1, precision));
        System.out.println("exp(x) trapezoid:     " + expTrap.integral(0, 1, precision));
    }
}
