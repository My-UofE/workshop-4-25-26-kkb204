// A Rectangle class
public class Rectangle {
  
  // 4 instance attributes
  public double width;
  public double height;
  public double originX = 0.0;
  public double originY = 0.0;

  // 1 static attributes
  public static final int NUMBER_OF_SIDES = 4;

  // main constructor
  public Rectangle(double width, double height, double originX, double originY) {
    this.width = width;
    this.height = height;
    this.originX = originX;
    this.originY = originY;
  }

  // second constructor: 
  public Rectangle(double width, double height) {
      this(width, height, 0, 0);
  }
  // second constructor: 
  public Rectangle() {
      this(1,1,0,0);
  }
  // method: move the rectangle
  public void move(double dx, double dy) {
	   originX += dx;
	   originY += dy;
  }

  // method: compute the area of the rectangle
  public double getArea() {
    return width * height;
  }
  
  // method: compute the area of the rectangle
  public double getPerimeter() {
    return 2 * (width + height);
  }
  
  // method: scale the rectangle
  public void scale(double scaleX, double scaleY) {
    width = scaleX * width;
    height = scaleY * height;
  }

   // method: scale the rectangle
  public void scale(double scaleFactor) {
    width = scaleFactor * width;
    height = scaleFactor * height;
  }

  public boolean isOverlappedWith(Rectangle r){
    double leftA = this.originX;
    double rightA = this.originX + this.width;
    double topA = this.originY;
    double bottomA = this.originY + this.height;

    double leftB = r.originX;
    double rightB = r.originX + r.width;
    double topB = r.originY;
    double bottomB = r.originY + r.height;

    if (rightA <= leftB) return false;  
    if (leftA >= rightB) return false;
    if (bottomA <= topB) return false;
    if (topA >= bottomB) return false;

    return true;
  }

  public static boolean areOverlapping(Rectangle r1, Rectangle r2) {
    return r1.isOverlappedWith(r2);
  }

  public void calcRatio() {
    ratio = width/height
  }

  public boolean isSquare() {
    if (width == height) return true;
    return false;
  }
}
