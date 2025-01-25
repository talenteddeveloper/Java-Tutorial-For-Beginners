package java_tutorial;

public class JaggedArrayIExample {

	public static void main(String[] args) {
		int[][] jaggedArray = {
				{1,2,3},
				{4,5},
				{6,7,8,9}
		};
		//System.out.println(jaggedArray[2][0]);
		for(int row=0; row< jaggedArray.length; row++) {
			for(int col=0; col<jaggedArray[row].length; col++) {
				System.out.print(jaggedArray[row][col]+ " ");
			}
			System.out.println();
		}
	}

}
