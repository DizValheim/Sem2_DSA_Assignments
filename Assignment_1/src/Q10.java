/*Write a method that returns the sum of all the elements in a specified column in a matrix 
using the following header:
			public static double sumColumn(double[][] m, int columnIndex)
Write a java program that reads a 3-by-4 matrix and displays the sum of each column. */

import java.util.Scanner;

public class Q10 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double[][] matrix = new double[3][4];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < matrix.length; i++) 
		{
			for (int j = 0; j < matrix[0].length; j++) 
			{
				matrix[i][j] = sc.nextDouble();
			}
		}

		for (int i = 0; i < matrix[0].length; i++) 
		{
			System.out.println("Sum of the elements at column " + i + " is " + sumColumn(matrix, i));	
		}
		
		sc.close();
	}

	public static double sumColumn(double[][] m, int columnIndex)
	{
		double sum=0;
		for (int i = 0; i < m.length; i++) 
		{
			sum+= m[i][columnIndex];
		}
		return sum;
	}

}
