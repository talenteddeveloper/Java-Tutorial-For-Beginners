package java_tutorial;

import java.util.Arrays;

public class ArrayOperations {

	public static void main(String[] args) {
		int[] numbers= {100,33,133,34,767};
		//length
		System.out.println("Length: "+numbers.length);
		
		//access
		System.out.println(" access: "+numbers[2]);
		
		//searching
		int target= 33;
		boolean isAvailable=false;
		for(int i=0; i<numbers.length; i++) {
			//System.out.println(numbers[i]);
			if( numbers[i] == target) {
				//System.out.println("Available : "+target);
				isAvailable = true;
				break;
			}
		}
		
		if(isAvailable) {
			System.out.println("found : "+target);
		}else {
			System.out.println("Not Available : "+target);
		}
		
		//sorting
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
//		for(int i=0; i<numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
		
		/// max and min
		//numbers= {10,33,133,34,67};
		int max=numbers[0];
		int min = numbers[0];
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] > max) {
				max = numbers[i];
			}
			
			if(numbers[i] < min) {
				min = numbers[i];
			}
		}
		
		System.out.println("max: "+max);
		System.out.println("min: "+min);
		
		//array copy
		int[] copy = Arrays.copyOf(numbers, numbers.length);
		System.out.println("Copy arrays: "+ Arrays.toString(copy));
	}

}
