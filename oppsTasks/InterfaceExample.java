package oppsTasks;

interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    public double calculateArea() {
        return length * breadth;
    }
}


public class InterfaceExample {

	public static void main(String[] args) {
		Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

	}

}
