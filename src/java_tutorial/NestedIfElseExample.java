package java_tutorial;

public class NestedIfElseExample {

	public static void main(String[] args) {
		int number=0;
		if(number > 0) {
			System.out.println("Number is +ve");
		}else {
			if( number < 0) {
				System.out.println("Number is -ve");
			}else {
				System.out.println("Number is zero");
			}
		}
	}

}
