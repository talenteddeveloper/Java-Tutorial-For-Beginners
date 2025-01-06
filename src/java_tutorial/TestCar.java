package java_tutorial;

// Creating Objects in Java Instance Variables and Methods Explained : https://youtu.be/QkMtuI4di-s
public class TestCar {

	public static void main(String[] args) {
		 // Creating the first object
		Car car1 = new Car();
		car1.brand="Tyota";
		car1.color="Red";
		car1.year=2020;
		
		// Creating the second object
		Car car2 = new Car();
		car2.brand="Honda";
		car2.color="Blue";
		car2.year=2022;
		
		 // Accessing the instance variables
		System.out.println("Car 1: " + car1.brand + ", " + car1.color + ", " + car1.year);
		
		// Calling the instance method
		car1.startEngine();
		
		// Accessing the instance variables
		System.out.println("Car 2: " + car2.brand + ", " + car2.color + ", " + car2.year);
		
		// Calling the instance method
		car2.startEngine();
	}

}
