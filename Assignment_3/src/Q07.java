/*Write a menu driven program to perform several mathematical operations. Different choices 
for the mathematical operations are as follows.
1. Determine the factorial of a number
2. Determine X^N for two numbers X, N
3. Determine GCD of two number.
4. Binary equivalent of a decimal number
5. Product of two numbers.
NOTE: All the mathematical operations must be performed using the recursive method. */
import java.util.Scanner;
public class Q07 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Diz's Menu driven program to perform Mathematical Operations!!");
		System.out.println("It can: \n1. Determine the factorial of a number\n"
				+ "2. Determine X N for two numbers X, N\n"
				+ "3. Determine GCD of two number.\n"
				+ "4. Binary equivalent of a decimal number\n"
				+ "5. Product of two numbers.");
		System.out.println("Enter your choice(number): ");
		int choice = sc.nextInt();
		
		
		switch(choice)
		{
			case 1:
			{
				System.out.print("Enter the number: ");
				int a = sc.nextInt();
				System.out.println("Factorial: " + Factorial(a)); 
				break;
			}
			case 2:
			{
				System.out.print("Enter two numbers separated by space: ");
				int a = sc.nextInt();
				int b = sc.nextInt();
				System.out.println("Power: " + Power(a,b));
				break;
			}
			case 3:
			{
				System.out.print("Enter two numbers separated by space: ");
				int a = sc.nextInt();
				int b = sc.nextInt();
				System.out.println("GCD: " + GCD(a,b));
				break;
			}
			case 4:
			{
				System.out.print("Enter the decimal number: ");
				int a = sc.nextInt();
				System.out.println("The number in binary: " + ToBinary(a));
				break;
			}
			case 5:
			{
				System.out.print("Enter two numbers separated by space: ");
				int a = sc.nextInt();
				int b = sc.nextInt();
				System.out.print("Product: ");
				System.out.print((a < 0 ^ b < 0) ? -1 * (Product(Math.abs(a), Math.abs(b))) : Product(Math.abs(a), Math.abs(b)));
				break;
			}
			default:
				System.out.println("Wrong choice!");
		}
		
		sc.close();
	}
	
	public static int Factorial(int a)
	{
		if(a==0)
			return 1;
		else
			return a * Factorial(a-1);
	}
	
	public static int Power(int a, int b)
	{
		if(b==0)
			return 1;
		else
			return a * Power(a,b-1);
	}

	public static int GCD (int a, int b)
	{
		if(b == 0)
			return a;
		else 
			return GCD(b, a%b);
	}

	public static String ToBinary(int a)
	{
		if(a == 0)
			return "0";
		else if (a == 1)
			return "1";
		else
			return ToBinary(a / 2) + String.valueOf(a % 2);
	}

	public static int Product (int a, int b)
	{
		
		if(b!=0)
			return a + Product(a, b-1);
		else 
			return 0;
	}


}
