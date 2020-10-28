public class TestTriangle {
  public static void main(String[] args) {
    Triangle t1 = new Triangle(0,0,3,0,3,4);

    System.out.println("Perimeter: " + t1.getPerimeter());
    System.out.println("Area: " + t1.getArea());
    System.out.println("Classify: " + t1.classify());
  }
}
