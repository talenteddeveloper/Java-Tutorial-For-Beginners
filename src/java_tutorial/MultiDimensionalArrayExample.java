package java_tutorial;

//Multi-Dimensional Arrays in Java  : https://youtu.be/_mn6tKz8nHY
public class MultiDimensionalArrayExample {

	public static void main(String[] args) {
		int[][] matrix = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		//System.out.println(matrix[2][1]);
		matrix[2][1] = 100;
		for(int row=0; row< matrix.length; row++) {
			for(int col=0; col<matrix[row].length;col++) {
				//System.out.println(matrix[row][col] + "( "+row+" "+col+" )");
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
	}

}
