public class CircleApp {

    public static void main(String[] args) {

        System.out.println("Creating circles...");

        Circle c1 = new Circle(10, 0, 0);
        Circle c2 = new Circle(5, 8, 0);
        Circle c3 = new Circle(3, 20, 20);


        // Area and circumference
        System.out.println("\nArea c1: " + c1.getArea());
        System.out.println("Circumference c1: " + c1.getCircumference());

        // Overlap tests
        System.out.println("\nOverlap tests:");
        System.out.println("c1 overlaps c2: " + c1.isOverlappedWith(c2)); // true
        System.out.println("c2 overlaps c1: " + c2.isOverlappedWith(c1)); // true
        System.out.println("c1 overlaps c3: " + c1.isOverlappedWith(c3)); // false

        // Static method
        boolean result = Circle.areOverlapping(c2, c3);
        System.out.println("Static check: c2 overlaps c3? " + result); // false

        // Move circle and test
        System.out.println("\nMoving c3 to (5,0)");
        c3.move(-15, -20);
        System.out.println("c1 overlaps c3 now? " + c1.isOverlappedWith(c3)); // true

        // Scale test
        System.out.println("\nScaling c3 by 2");
        c3.scale(2);
        System.out.println("New radius of c3: " + c3.getRadius());
    }
}

