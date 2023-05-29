/*Write a java program by using conditional statement to show the category for a given BMI.*/

import java.util.Scanner;

public class Q02 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		float height, bmi, weight;
		System.out.print("Enter the weight(in kg): ");
		weight = sc.nextFloat();
		System.out.print("Enter the height(in m): ");
		height = sc.nextFloat();
		bmi = weight/ (height*height);

		System.out.print("The person is ");
		if(bmi<18.5)
			System.out.println("Underweight.");
		else if(bmi>=18.5 && bmi<=24.9)
			System.out.println("Normal weight.");
		else if(bmi>=25 && bmi<=29.9)
			System.out.println("Overweight.");
		else if(bmi>=30)
			System.out.println("Obese.");

		sc.close();
	}

}
