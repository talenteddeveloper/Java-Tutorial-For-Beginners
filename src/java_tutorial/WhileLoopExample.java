package java_tutorial;

public class WhileLoopExample {

	public static void main(String[] args) {
		int i=1;
		while(i<6) {
			System.out.println(i);
			if(i==3) {
				System.out.println("Hello "+i);
			}
			i++;// i= i +1;
		}
	}

}
