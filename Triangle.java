public class Triangle {
  private Point v1, v2, v3;

  public Triangle(Point a, Point b, Point c) {
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
    Point p1 = new Point(x1,y1);
    Point p2 = new Point(x2,y2);
    Point p3 = new Point(x3,y3);
    v1 = p1;
    v2 = p2;
    v3 = p3;
  }

  public double getPerimeter() {
    double s1 = v1.distanceTo(v2);
    double s2 = v2.distanceTo(v3);
    double s3 = v3.distanceTo(v1);
    return s1 + s2 + s3;
  }

  public double getArea() {
    double s1 = v1.distanceTo(v2);
    double s2 = v2.distanceTo(v3);
    double s3 = v3.distanceTo(v1);
    double a = getPerimeter() / 2;
    double heron = (Math.sqrt((a * (a - s1) * (a - s2) * (a - s3))));
    return heron;
  }

  public String classify() {
    double s1 = Math.round(v1.distanceTo(v2) * 10000.0) / 10000.0;
    double s2 = Math.round(v2.distanceTo(v3) * 10000.0) / 10000.0;
    double s3 = Math.round(v3.distanceTo(v1) * 10000.0) / 10000.0;
    if ((s1 == s2) && (s1 == s3)) return "equilateral";
    if ((s1 == s2) || (s1 == s3) || (s2 == s3)) return "isosceles";
    return "scalene";
  }

  public String toString() {
    double X1 = v1.getX();
    double X2 = v2.getX();
    double X3 = v3.getX();

    double Y1 = v1.getY();
    double Y2 = v2.getY();
    double Y3 = v3.getY();

    String s = "v1(" + X1 + ", " + Y1 + ") v2(" + X2 + ", " + Y2 + ") v3(" + X3 + ", " + Y3 + ")";
    return s;
  }

  public void setVertex(int index, Point newP) {
    if (index == 0) v1 = newP;
    if (index == 1) v2 = newP;
    if (index == 2) v3 = newP;
  }

}
