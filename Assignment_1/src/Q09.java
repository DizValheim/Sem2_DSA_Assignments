/*Write a method that sums all the numbers in the major diagonal in an n * n matrix of double
values using the following header:
			public static double sumMajorDiagonal(double[][] m)
Write a java program that reads a 4-by-4 matrix and displays the sum of all its elements on the
major diagonal. 
*/

import java.util.Scanner;

public class Q09 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of Row and Columns of 2D-Array: ");
		int n = sc.nextInt();

		double[][] matrix = new double[n][n];
		
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < matrix.length; i++) 
		{
			for (int j = 0; j < matrix.length; j++) 
			{
				matrix[i][j] = sc.nextDouble();
			}
		}

		System.out.println("The elements of 2D array are: ");
		Display(matrix);

		System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));

		sc.close();

	}

	/**
	 * Sums all the numbers in the major diagonal in an n * n matrix of double values.
	 * @param m
	 * @return
	 */
	public static double sumMajorDiagonal(double[][] m)
	{
		double sum=0;

		for (int i = 0; i < m.length; i++) 
		{
			for (int j = 0; j < m.length; j++) 
			{
				if(i == j)
					sum += m[i][j];
			}
			
		}
		return sum;

	}

	/**Prints the elements of the array one by one.*/	
	public static void Display(double[][] matrix) {
		for (int i = 0; i < matrix.length; i++) 
		{
			for (int j = 0; j < matrix.length; j++) 
			{
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
