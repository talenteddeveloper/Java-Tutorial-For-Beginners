package java_tutorial;

public class IfElseExample {

	public static void main(String[] args) {
		int number = 1;
		if( number > 0 || number>2) {
			System.out.println("Number is +ve");
		}else {
			System.out.println("Number is -ve");
		}
		
		if( number % 2 == 0) {
			System.out.println("Number is even");
		}else {
			System.out.println("Number is odd");
		}
	}

}
