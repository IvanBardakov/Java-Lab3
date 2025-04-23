package Task4;

class ArrayOfPoints2D extends AbstractArrayOfPoints {
    private double[][] points = new double[0][2];

    @Override
    public void setPoint(int i, double x, double y) {
        points[i][0] = x;
        points[i][1] = y;
    }

    @Override
    public double getX(int i) {
        return points[i][0];
    }

    @Override
    public double getY(int i) {
        return points[i][1];
    }

    @Override
    public int count() {
        return points.length;
    }

    @Override
    public void addPoint(double x, double y) {
        double[][] newPoints = new double[points.length + 1][2];
        System.arraycopy(points, 0, newPoints, 0, points.length);
        newPoints[points.length][0] = x;
        newPoints[points.length][1] = y;
        points = newPoints;
    }

    @Override
    public void removeLast() {
        if (points.length > 0) {
            double[][] newPoints = new double[points.length - 1][2];
            System.arraycopy(points, 0, newPoints, 0, newPoints.length);
            points = newPoints;
        }
    }
}