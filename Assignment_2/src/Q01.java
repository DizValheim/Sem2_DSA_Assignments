/*A phone number can be thought of as having three parts: the area code, the exchange code and 
the number. 
Example: A phone number, such as (212) 767-8900, can be thought of as having three parts: 
the area code (212), the exchange (767) and the number (8900).
Define a class Phone to store these three parts of a phone number separately as instance 
variable (area_code, exchange, number). The class consists of two member methods: input ( )
and display ( ). Create two class objects of type phone. Initialize one directly (by using dot (.) 
operator and instance variable with value area_code: 212, exchange: 767, 
number: 8900), and initialize other from the user through member method input ( ). Display 
both the numbers. */

import java.util.Scanner;

class Phone 
{
	private int area_code;
	private int exchange;
	private int number;
	
	Phone(int a_code, int exc, int n)
	{
		area_code = a_code;
		exchange = exc;
		number = n;
	}
	
	Phone()
	{
		
	}
	
	void Input(int a_code, int exc, int n)
	{
		area_code = a_code;
		exchange = exc;
		number = n;
	}
	
	void Display()
	{
		System.out.println("(" + area_code + ") " + exchange + "-" + number);
		
	}
	
}


public class Q01 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Phone myPhone = new Phone(212, 767, 8900);
		System.out.print("My phone number is: ");
		myPhone.Display();
		
		Phone yourPhone = new Phone();
		
		System.out.print("Enter the Phone number: ");
		int area_code = sc.nextInt();
		int exchange = sc.nextInt();
		int number = sc.nextInt();
		
		
		yourPhone.Input(area_code, exchange, number);
		
		
		System.out.println("Your phone number is: ");
		yourPhone.Display();
		
		sc.close();
	}
	
	

}

