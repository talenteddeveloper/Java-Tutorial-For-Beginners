package java_tutorial;

import java.util.Scanner;

public class UserInputExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter you name");
		
		String name = scanner.next();
		
//		System.out.println("Enter your age");
//		int age= scanner.nextInt();
//		
		System.out.println("Name: "+name);
//		System.out.println("Age: "+age);
	}

}
