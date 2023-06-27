//Write a java program to print M-by-N array in the tabular format. Also, display the sum of elements of the array.

import java.util.Scanner;

public class Q08 
{
	static int m,n;

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of Row and Columns of 2D-Array: ");
		m = sc.nextInt();
		n = sc.nextInt();

		int[][] matrix = new int[m][n];
		int sum = 0;

		System.out.print("Enter the elements of the matrix: ");
		for (int i = 0; i < m; i++) 
		{
			for (int j = 0; j < n; j++) 
			{
				matrix[i][j] = sc.nextInt();
				sum+=matrix[i][j];
			}
		}
	
		System.out.println("The elements of 2D array are: ");
		Display(matrix);

		System.out.println("The sum of elements of the 2D-Array is " + sum);

		sc.close();
	}

	/**Prints the elements of the array one by one.*/	
	public static void Display(int[][] matrix) {
		for (int i = 0; i < m; i++) 
		{
			for (int j = 0; j < n; j++) 
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
