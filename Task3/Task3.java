package Task3;

public class Task3 {
    public static void main(String[] args) {
        double a = -1.0;
        double b = 2.0;
        double h = 0.1;

        // 1. Абстрактний клас та похідні класи
        Function squareFunction = new SquareFunction();
        Function shiftedSquareFunction = new ShiftedSquareFunction();
        System.out.println("Abstract class - Minimum of x^2: " +
                MinimumFinder.findMinimum(squareFunction::evaluate, a, b, h));
        System.out.println("Abstract class - Minimum of (x-1)^2 + 1: " +
                MinimumFinder.findMinimum(shiftedSquareFunction::evaluate, a, b, h));

        // 2. Інтерфейс та класи, що його реалізують
        FunctionInterface squareFunctionImpl = new SquareFunctionImpl();
        FunctionInterface shiftedSquareFunctionImpl = new ShiftedSquareFunctionImpl();
        System.out.println("Interface with classes - Minimum of x^2: " +
                MinimumFinder.findMinimum(squareFunctionImpl, a, b, h));
        System.out.println("Interface with classes - Minimum of (x-1)^2 + 1: " +
                MinimumFinder.findMinimum(shiftedSquareFunctionImpl, a, b, h));

        // 3. Інтерфейс та анонімні класи
        FunctionInterface squareAnon = new FunctionInterface() {
            @Override
            public double evaluate(double x) {
                return x * x;
            }
        };
        FunctionInterface shiftedSquareAnon = new FunctionInterface() {
            @Override
            public double evaluate(double x) {
                return (x - 1) * (x - 1) + 1;
            }
        };
        System.out.println("Anonymous classes - Minimum of x^2: " +
                MinimumFinder.findMinimum(squareAnon, a, b, h));
        System.out.println("Anonymous classes - Minimum of (x-1)^2 + 1: " +
                MinimumFinder.findMinimum(shiftedSquareAnon, a, b, h));

        // 4. Лямбда-вирази
        FunctionInterface squareLambda = x -> x * x;
        FunctionInterface shiftedSquareLambda = x -> (x - 1) * (x - 1) + 1;
        System.out.println("Lambda expressions - Minimum of x^2: " +
                MinimumFinder.findMinimum(squareLambda, a, b, h));
        System.out.println("Lambda expressions - Minimum of (x-1)^2 + 1: " +
                MinimumFinder.findMinimum(shiftedSquareLambda, a, b, h));

        // 5. Посилання на методи
        FunctionInterface squareMethodRef = Functions::square;
        FunctionInterface shiftedSquareMethodRef = Functions::shiftedSquare;
        System.out.println("Method references - Minimum of x^2: " +
                MinimumFinder.findMinimum(squareMethodRef, a, b, h));
        System.out.println("Method references - Minimum of (x-1)^2 + 1: " +
                MinimumFinder.findMinimum(shiftedSquareMethodRef, a, b, h));
    }
}
