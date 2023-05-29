/*Write a Java program that can take a positive integer greater than 2 as input and write out the
number of times one must repeatedly divide this number by 2 before getting a value less
than 2.*/

import java.util.Scanner;

public class Q01 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int input, count=0;
		System.out.print("Enter the number: ");
		input = sc.nextInt();
		int n = input;
		while (n>2) 
		{
			n/=2;
			count++;
		}

		System.out.println("The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is "+count);

		sc.close();
	}

}
