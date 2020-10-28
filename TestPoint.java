public class TestPoint {
  public static void main(String[] args) {
    Point point1 = new Point(0,0);
    Point point2 = new Point(5,7);
    Point point3 = new Point(-2,8);

    System.out.println("Point 1 X coordinate: " + point1.getX());
    System.out.println("Point 1 Y coordinate: " + point1.getY());
    System.out.println();

    System.out.println("Point 2 X coordinate: " + point2.getX());
    System.out.println("Point 2 Y coordinate: " + point2.getY());
    System.out.println();

    System.out.println("Point 3 X coordinate: " + point3.getX());
    System.out.println("Point 3 Y coordinate: " + point3.getY());
    System.out.println();
  }
}
