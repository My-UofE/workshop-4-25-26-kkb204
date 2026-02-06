// A Circle class
public class Circle {

    // instance attributes (encapsulated)
    private double radius;
    private double originX;
    private double originY;

    // main constructor
    public Circle(double radius, double originX, double originY) {
        this.radius = radius;
        this.originX = originX;
        this.originY = originY;
    }

    public Circle(double radius){
        this(radius, 0, 0);
    }

    public Circle() {
        this(1, 0, 0);
    }

    public double getRadius(){
        return radius;
    }

    public double getOriginX(){
        return originX;
    }

    public double getOriginY(){
        return originY;
  }
    public double setRadius(){
        return radius;
  }
    // setters
    public void setOriginX(double originX) {
        this.originX = originX;
        
  }

    public void setOriginY(double originY) {
        this.originY = originY;
        }

    // move the rectangle
    public void move(double dx, double dy) {
        originX += dx;
        originY += dy;
    }

    // compute area
    public double getArea() {
        return 3.14*(radius*radius);
    }

    // compute perimeter
    public double getCircumference() {
        return 3.14*(radius*2);
    }

    // uniform scale
    public void scale(double scaleFactor) {
        radius = radius*scaleFactor;
    }

    public boolean isOverlappedWith(Circle c) {
        double dx = this.originX - c.originX;
        double dy = this.originY - c.originY;
        double distanceSquared = dx * dx + dy * dy;
        double radiusSum = this.radius + c.radius;
        return distanceSquared <= radiusSum * radiusSum;
    }


    // Static method
    public static boolean areOverlapping(Circle c1, Circle c2) {
        return c1.isOverlappedWith(c2);
    }
}