/*Write a method to add two matrices. The header of the method is as follows:
            public static double[][] addMatrix(double[][] a, double[][] b)
In order to be added, the two matrices must have the same dimensions and the same or compatible types of elements.*/

import java.util.Scanner;

public class HQ04 
{
    static int h,l;
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dimensions of the matrix: ");
        h = sc.nextInt();
        l = sc.nextInt();
        double [][] a = new double[h][l];
        System.out.print("Enter the elements of the a: ");
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				a[i][j] = sc.nextInt();
			}
		}

        double [][] b = new double[h][l];
        System.out.print("Enter the elements of the b: ");
		for (int i = 0; i < b.length; i++) 
		{
			for (int j = 0; j < b.length; j++) 
			{
				b[i][j] = sc.nextInt();
			}
		}

        System.out.println("Sum of the matrix: ");
        double [][] sumArr = addMatrix(a, b);
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                if(i==0 && j==0)
                    System.out.print("[");
                System.out.print(sumArr[i][j]);
                if(i==h-1 && j==l-1)
                    System.out.print("]");
                else
                    System.out.print(", ");
            }
        }

        sc.close();;
    }

    public static double[][] addMatrix(double[][] a, double[][] b)
    {
        
        double [][] sumArr = new double[h][l];
        for (int i = 0; i < h; i++) 
        {
            for (int j = 0; j < l; j++) 
            {
                sumArr[i][j] = a[i][j] + b[i][j];
            }
        }
        return sumArr;
    }
}
