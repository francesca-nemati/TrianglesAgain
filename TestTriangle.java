public class TestTriangle {
  public static void main(String[] args) {
    Triangle t1 = new Triangle(0,0,3,0,3,4);

    System.out.println("Perimeter: " + t1.getPerimeter());
    System.out.println("Area: " + t1.getArea());
    System.out.println("Classify: " + t1.classify());
    System.out.println("String: " + t1.toString());

    Point p1 = new Point(6,0);
    Point p2 = new Point(6,8);
    t1.setVertex(1, p1);
    t1.setVertex(2, p2);
    System.out.println("New Triangle: " + t1.toString());
  }
}
