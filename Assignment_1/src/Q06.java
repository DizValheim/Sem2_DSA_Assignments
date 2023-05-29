/*Write a Java method, isOdd( ), that takes an int i and returns true if and only if i is odd. Your method can't use the multiplication, modulus, or division operators, The method signature is 
as follows.
	public static boolean isOdd(int n) 
*/

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		System.out.println(n + " is odd: " + isOdd(n));
		
		sc.close();

	}
	
	public static boolean isOdd(int i)
	{
		String s = Integer.toBinaryString(i);
		if(s.charAt(s.length()-1)=='1')
			return true;
		return false;
	}

}
