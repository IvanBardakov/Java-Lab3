package Task4;

class ArrayOfPoints1D extends AbstractArrayOfPoints {
    private double[] points = new double[0];

    @Override
    public void setPoint(int i, double x, double y) {
        points[2 * i] = x;
        points[2 * i + 1] = y;
    }

    @Override
    public double getX(int i) {
        return points[2 * i];
    }

    @Override
    public double getY(int i) {
        return points[2 * i + 1];
    }

    @Override
    public int count() {
        return points.length / 2;
    }

    @Override
    public void addPoint(double x, double y) {
        double[] newPoints = new double[points.length + 2];
        System.arraycopy(points, 0, newPoints, 0, points.length);
        newPoints[points.length] = x;
        newPoints[points.length + 1] = y;
        points = newPoints;
    }

    @Override
    public void removeLast() {
        if (points.length >= 2) {
            double[] newPoints = new double[points.length - 2];
            System.arraycopy(points, 0, newPoints, 0, newPoints.length);
            points = newPoints;
        }
    }

    @Override
    public void test() {
        System.out.println("Testing ArrayOfPoints1D");
        addPoint(1.0, 2.0);
        addPoint(3.0, 4.0);
        System.out.println("Count: " + count());
        System.out.println("Point 0: (" + getX(0) + ", " + getY(0) + ")"); // (1.0, 2.0)
        setPoint(1, 5.0, 6.0);
        System.out.println("Point 1: (" + getX(1) + ", " + getY(1) + ")"); // (5.0, 6.0)
        removeLast();
        System.out.println("Count after remove: " + count()); // Should be 1
        System.out.println("Point 0: (" + getX(0) + ", " + getY(0) + ")"); // (1.0, 2.0)
        removeLast();
        System.out.println("Final count: " + count());
        System.out.println("Test complete\n");
    }

}