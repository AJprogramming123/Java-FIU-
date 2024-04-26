package Week13;

public class TestSimpleCircle {
    /** Main method */
    public static void main(String[] args) {
        // Create a circle with radius 1
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("The area of the circle of radius "
                + circle1.radius + " is " + circle1.getArea());

        // Create a circle with radius 25
        SimpleCircle circle2 = new SimpleCircle(30);
        System.out.println("The area of the circle of radius "
                + circle2.radius + " is " + circle2.getArea());

        // Create a circle with radius 125
        SimpleCircle circle3 = new SimpleCircle(125);
        System.out.println("The area of the circle of radius "
                + circle3.radius + " is " + circle3.getArea());

        // Modify circle radius
        circle2.radius = 100; // or circle2.setRadius(100)
        System.out.println("The area of the circle of radius "
                + circle2.radius + " is " + circle2.getArea());
    }
}

