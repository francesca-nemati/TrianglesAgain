public class Point {

  private double x,y;

  public Point(double X, double Y) {
    x = X;
    y = Y;
  }

  public Point(Point p) {
    x = p.x;
    y = p.y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public double distanceTo(Point other) {
    double X1 = x;
    double Y1 = y;
    double X2 = other.getX();
    double Y2 = other.getY();
    double distance = Math.sqrt((Math.pow((Y2 - Y1),2)) + (Math.pow((X2 - X1),2)));
    return distance;
  }

  public boolean equals(Point other) {
    if (x == other.getX() && y == other.getY()) return true;
    else return false;
  }

}
