public class Circle {
    double radius;
    
    public Circle() {
        // constructor chaining
        this(1.0);
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public static void main(String[] args) {
        // default constructor
        Circle circle1 = new Circle();
        System.out.println("Circle 1 radius: " + circle1.radius);
        
        // parameterized constructor
        Circle circle2 = new Circle(5.5);
        System.out.println("Circle 2 radius: " + circle2.radius);
    }
}
