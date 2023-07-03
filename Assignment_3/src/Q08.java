/*Write a recursive method in Java which, given an integer n, print it with its digits reversed.
For example, given 4735, it prints 5374 */

import java.util.Scanner;

public class Q08 
{   
    static int reversed = 0;
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.println("Reversed number is: " + Reverse(n));

        sc.close();
    }

    public static int Reverse (int n)
    {
        if(n == 0)
            return reversed;
        else
        {
            int rem = n % 10;
            reversed = reversed * 10 +rem;
            return Reverse(n/10);
        }
        
            
    }

}
