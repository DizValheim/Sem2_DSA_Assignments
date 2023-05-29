/*	Write a java method to calculate the sum of digits of a given number until the number is a single digit. The method signature is as follows.
		public static int sum_Of_Digits(int n) 
*/

import java.util.Scanner;

public class Q05 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		
		System.out.println("Sum of digits of " + n + " until the number is a single digit is " +sum_Of_Digits(n));
		
		sc.close();

	}

	public static int sum_Of_Digits(int n)
	{
		int rem=n%10, sum=rem;
		n/=10;
		
		while(n!=0)
		{
			rem = n%10;
			sum+=rem;
			n/=10;
			if(sum/10!=0 && n==0)
			{
				n=sum;
				sum=0;
			}
		}
		return sum;
	}

}
