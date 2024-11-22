package oppsTasks;

class Calculator{
	public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public void display() {
        System.out.println("This is the Calculator class.");
    }
}

public class OverloadingAndOverriding extends Calculator {
	
	public void display() {
		System.out.println("This is the child class");
	}

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		System.out.println("Sum of two integers: " + calculator.add(10, 20));
        System.out.println("Sum of two doubles: " + calculator.add(5.5, 4.5));
        System.out.println("Sum of three integers: " + calculator.add(1, 2, 3));
        calculator.display();
        
        OverloadingAndOverriding obj = new OverloadingAndOverriding();
        obj.display();

	}

}
