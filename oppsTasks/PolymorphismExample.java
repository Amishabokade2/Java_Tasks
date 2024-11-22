package oppsTasks;

class Vehicle {
    public void displayDetails() {
        System.out.println("This is a vehicle.");
    }
}

class Car extends Vehicle {
    private String brand;
    private int numberOfDoors;

    public Car(String brand, int numberOfDoors) {
        this.brand = brand;
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

class Bike extends Vehicle {
     String type;
     boolean hasCarrier;

    public Bike(String type, boolean hasCarrier) {
        this.type = type;
        this.hasCarrier = hasCarrier;
    }

    public void displayDetails() {
        System.out.println("Type: " + type);
        System.out.println("Has Carrier: " + true);
    }
}


public class PolymorphismExample {

	public static void main(String[] args) {
		 Vehicle vehicle1 = new Car("Toyota", 4);
	     Vehicle vehicle2 = new Bike("Mountain Bike", true);

	        vehicle1.displayDetails();
	        System.out.println();
	        vehicle2.displayDetails();

	}

}
