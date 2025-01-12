package java_tutorial;

public class OneDArrayExample {

	public static void main(String[] args) {
		int[] marks = {85,90,78,92,88};
		//System.out.println(marks[0]);
		//marks[0]=100;
		//System.out.println(marks[20]);
		int sum=0;
		for(int i =0; i< marks.length; i++) {
			System.out.println(i +" "+marks[i]);
			sum = sum + marks[i];
		}
		
		System.out.println("Sum: "+sum);
	}

}
