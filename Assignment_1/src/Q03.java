/*Write a java program to check whether a number is a spy number or not.*/

import java.util.Scanner;

public class Q03 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int input, num,rem, sum =0, product=1;
		System.out.print("Enter the number: ");
		input = sc.nextInt();
		num=input;
		do 
		{
			rem = num%10;
			sum+=rem;
			product*=rem;
			num/=10;

		} while (num!=0);
		System.out.println(input + " is " + ((sum == product)? "a" : "not a")+ " spy number.");

		sc.close();
	}

}
