public class RectangleApp {

    public static void main(String[] args) {

        System.out.println("Creating myRect1");

        Rectangle myRect1;
        myRect1 = new Rectangle(20.0, 8.0, 30, 30);

        // static field
        System.out.println("Rectangle has " + Rectangle.NUMBER_OF_SIDES + " sides");

        // instance data via getters
        System.out.println("Width: " + myRect1.getWidth() +
                           ", Height: " + myRect1.getHeight());
        System.out.println("Origin is: " +
                           myRect1.getOriginX() + "," + myRect1.getOriginY());

        // calling methods
        System.out.println("Area: " + myRect1.getArea());

        System.out.println("\nMoving myRect1");
        myRect1.move(0, 10);
        System.out.println("Origin is: " +
                           myRect1.getOriginX() + "," + myRect1.getOriginY());

        System.out.println("Changing width of myRect1");
        myRect1.setWidth(16);
        System.out.println("Width: " + myRect1.getWidth() +
                           ", Height: " + myRect1.getHeight());

        System.out.println("\nCreating myRect2");
        Rectangle myRect2 = new Rectangle(20.0, 8.0);
        System.out.println("Width: " + myRect2.getWidth() +
                           ", Height: " + myRect2.getHeight());
        System.out.println("Origin: " +
                           myRect2.getOriginX() + "," + myRect2.getOriginY());

        System.out.println("\nCreating myRect3");
        Rectangle myRect3 = new Rectangle();
        System.out.println("Width: " + myRect3.getWidth() +
                           ", Height: " + myRect3.getHeight());
        System.out.println("Origin: " +
                           myRect3.getOriginX() + "," + myRect3.getOriginY());

        myRect1.scale(0.5);
        System.out.println("Width: " + myRect1.getWidth() +
                           ", Height: " + myRect1.getHeight());

        myRect2.scale(1, 3);
        System.out.println("Width: " + myRect2.getWidth() +
                           ", Height: " + myRect2.getHeight());

        myRect3.scale(15, 10);
        System.out.println("Width: " + myRect3.getWidth() +
                           ", Height: " + myRect3.getHeight());

        Rectangle myRect4 = new Rectangle(30.0, 5.0, 10, 10);
        Rectangle myRect5 = new Rectangle(50.0, 20.0, 0, 0);
        Rectangle myRect6 = new Rectangle(20.0, 40.0, 500, 500);

        // overlap tests
        System.out.println("myRect4 overlaps myRect5: " +
                           myRect4.isOverlappedWith(myRect5));
        System.out.println("myRect5 overlaps myRect4: " +
                           myRect5.isOverlappedWith(myRect4));

        System.out.println("myRect4 overlaps myRect6: " +
                           myRect4.isOverlappedWith(myRect6));
        System.out.println("myRect6 overlaps myRect4: " +
                           myRect6.isOverlappedWith(myRect4));

        boolean result = Rectangle.areOverlapping(myRect4, myRect5);
        System.out.println("myRect4 overlaps myRect5: " + result);

		System.out.println("Check class prevents negative widths");

		// initialise rectangle for test
		Rectangle myRect7 = new Rectangle(30.0, 5.0, 10, 10); 
		System.out.println( "Width: "+myRect7.getWidth()+", Height: "+myRect7.getHeight() );

		// change to positive width should be allowed
		myRect7.setWidth(40);
		System.out.println( "Width: "+myRect7.getWidth()+", Height: "+myRect7.getHeight() );

		// change to negative width should be ignored
		myRect7.setWidth(-10);
		System.out.println( "Width: "+myRect7.getWidth()+", Height: "+myRect7.getHeight() );

		Rectangle r1 = new Rectangle(10.0,5.0);
		Rectangle r2 = new Rectangle(10.0,5.0);
		Rectangle r3 = r2;
		System.out.println("Object reference tests:");
		System.out.println("r1: " + r1);
		System.out.println("r2: " + r2);
		System.out.println("r3: " + r3);

		r2.scale(0.5);
		System.out.println("r2 width: " + r2.getWidth());
		System.out.println("r3 width: " + r3.getWidth());

		
		}
}
