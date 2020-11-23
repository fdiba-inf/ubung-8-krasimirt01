package exercise8;

public class Point {
  private double x;
  private double y;

  public Point() {
    x = 0;
    y = 0;
  }

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public Point(Point otherPoint) {
    x = otherPoint.x;
    y = otherPoint.y;
  }

  public void initialize() {
    x = Utils.INPUT.nextDouble();
    y = Utils.INPUT.nextDouble();
  }

  public void translate(double xDelta, double yDelta) {
    x += xDelta;
    y += yDelta;
  }

  public Point createNewTranslatedPoint(double xDelta, double yDelta) {
    double xnew = x + xDelta;
    double ynew = y + yDelta;
    return new Point(xnew, ynew);
  }

  public boolean equals(Point otherPoint) {
    boolean pruf1 = Utils.equals(x, otherPoint.x);
    boolean pruf2 = Utils.equals(y, otherPoint.y);
    return pruf1 && pruf2;
  }

  public String toString() {
    return "(" + x + ", " + y + ")";
  }
}
