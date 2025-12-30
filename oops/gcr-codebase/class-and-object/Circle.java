public class Circle {
    double radius;

    // initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // find circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // display circle information
    public void displayResults() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        circle.displayResults();
    }
}