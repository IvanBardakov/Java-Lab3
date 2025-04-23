package Task3;

public class ShiftedSquareFunctionImpl implements FunctionInterface{
    @Override
    public double evaluate(double x) {
        return (x - 1) * (x - 1) + 1;
    }
}
