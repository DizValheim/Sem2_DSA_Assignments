/*Write a Java program that takes two arrays a and b of length n storing int values, and returns
the dot product of a and b. That is, it returns an array c of length n such that c[i] = a[i] · b[i],
for i = 0, . . . , n − 1. */

import java.util.Arrays;
import java.util.Scanner;

public class HQ03 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the arrays: ");
        int n = sc.nextInt();
        int [] a = new int[n];
        int [] b = new int[n];

        System.out.print("Enter the elements of a: ");
        for (int i = 0; i < a.length; i++) 
        {
            a[i] = sc.nextInt();    
        }

        System.out.print("Enter the elements of b: ");
        for (int i = 0; i < b.length; i++) 
        {
            b[i] = sc.nextInt();    
        }

        System.out.println("The dot product of them is: ");
        int [] c = new int[n];
        for (int i = 0; i < c.length; i++) 
        {
            c[i] = a[i] * b[i];    
        }

        System.out.println(Arrays.toString(c));
        
        sc.close();
    }
}
