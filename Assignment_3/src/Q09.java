/*The sequence of numbers 1, 1, 2, 3, 5, 8, 13 etc are called Fibonacci numbers,
each is the sum of the preceding two. Write a recursive method in Java which, given n,
returns the nth Fibonacci number. */

import java.util.Scanner;

public class Q09 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("The " + n + " numbered term of the fibonacci series is " + Fibonacci(n));

        sc.close();
    }

    public static int Fibonacci(int n)
    {
        if(n<=1)
            return n;
        else
            return Fibonacci(n-1) + Fibonacci(n-2);
    }
}
