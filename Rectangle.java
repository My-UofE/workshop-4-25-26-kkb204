// A Rectangle class
public class Rectangle {

  // instance attributes (encapsulated)
  private double width;
  private double height;
  private double originX;
  private double originY;

  // static attribute
  public static final int NUMBER_OF_SIDES = 4;

  // main constructor
  public Rectangle(double width, double height, double originX, double originY) {
    this.width = width;
    this.height = height;
    this.originX = originX;
    this.originY = originY;
  }

  // constructor with default origin
  public Rectangle(double width, double height) {
    this(width, height, 0, 0);
  }

  // default constructor
  public Rectangle() {
    this(1, 1, 0, 0);
  }

  // getters
  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }

  public double getOriginX() {
    return originX;
  }

  public double getOriginY() {
    return originY;
  }

  // setters
  public void setWidth(double width) {
    if (width >= 0) {
      this.width = width;
    }
  }

  public void setHeight(double height) {
    if (height >= 0) {
      this.height = height;
    }
  }

  // move the rectangle
  public void move(double dx, double dy) {
    originX += dx;
    originY += dy;
  }

  // compute area
  public double getArea() {
    return width * height;
  }

  // compute perimeter
  public double getPerimeter() {
    return 2 * (width + height);
  }

  // scale the rectangle
  public void scale(double scaleX, double scaleY) {
    width *= scaleX;
    height *= scaleY;
  }

  // uniform scale
  public void scale(double scaleFactor) {
    scale(scaleFactor, scaleFactor);
  }

  // overlap check (instance)
  public boolean isOverlappedWith(Rectangle r) {
    double leftA   = originX;
    double rightA  = originX + width;
    double topA    = originY;
    double bottomA = originY + height;

    double leftB   = r.originX;
    double rightB  = r.originX + r.width;
    double topB    = r.originY;
    double bottomB = r.originY + r.height;

    if (rightA <= leftB) return false;
    if (leftA >= rightB) return false;
    if (bottomA <= topB) return false;
    if (topA >= bottomB) return false;

    return true;
  }

  // overlap check (static)
  public static boolean areOverlapping(Rectangle r1, Rectangle r2) {
    return r1.isOverlappedWith(r2);
  }

  // aspect ratio (FIXED: no stored state)
  public double getRatio() {
    return width / height;
  }

  // check if square
  public boolean isSquare() {
    return width == height;
  }
}

