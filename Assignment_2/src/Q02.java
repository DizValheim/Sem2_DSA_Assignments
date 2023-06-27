/*Define a class called Complex with instance variables real, imag and instance methods
setData(), display(), add(). Write a Java program to add two complex numbers.
The prototype of add method is: 
			public Complex add(Complex, Complex) */

import java.util.Scanner;

class Complex
{
    double real;
    double imag;    
    void setData (double r, double i) 
    {
        real = r;
        imag= i;
    }
    
    void display() 
    {
        System.out.printf("%.2f %s %.2f %s \n", real, (imag < 0 ? " - " : " + "), Math.abs(imag), "i");
    }
    
    Complex add(Complex c1, Complex c2) {
        Complex result = new Complex();
        result.real = c1.real + c2.real;
        result.imag = c1.imag + c2.imag;
        return result;
    }     
}
public class Q02 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
		double r,i;

		Complex c1 = new Complex();
		System.out.print("Enter real and imaginary part of 1st number separated by space:");
		r = sc.nextDouble();
        i = sc.nextDouble();
		c1.setData(r,i);

		Complex c2 = new Complex();
		System.out.print("Enter real and imaginary part of 2nd number separated by space : ");
		r = sc.nextDouble();
        i = sc.nextDouble();
		c2.setData(r,i);

		System.out.print("The 1st Complex number is: ");
		c1.display();
		System.out.print("The 2nd Complex number is: ");
		c2.display();

		Complex sum=new Complex();
		sum=sum.add(c1,c2);
		System.out.print("The sum is: ");
		sum.display();

        sc.close();
    }
}

