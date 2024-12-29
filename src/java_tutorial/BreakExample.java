package java_tutorial;
// Java Break Statement Explained with Examples: https://youtu.be/KN7Twyx9T4o
public class BreakExample {

	public static void main(String[] args) {
		for(int i=1; i<11;i++) {
			
			if(i==5) {
				//System.out.println("Hello");
				break;
			}
			System.out.println(i);
		}
		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("A Grade");
			break;
		
		default:
			System.out.println("Invalid grade");
		}
	}

}
