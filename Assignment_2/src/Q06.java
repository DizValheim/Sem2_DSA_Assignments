/*Create an abstract class Shape and the derived classes Square, Triangle and Circle. Write a
java program to display area of different shapes. */
abstract class Shape{
	abstract double area();
}

class Square extends Shape
{
	double side;
	
	Square(double side)
	{
		this.side = side;
	}
	
	double area()
	{
		return side*side;
	}
}

class Triangle extends Shape
{
	double base;
	double height;
	
	Triangle(double base, double height)
	{
		this.base = base;
		this.height = height;
	}
	
	double area()
	{
		return 0.5*base*height;
	}
}

class Circle extends Shape
{
	double radius;
	
	Circle(double radius)
	{
		this.radius = radius;
	}
	
	double area()
	{
		return Math.PI*radius*radius;
	}
}

public class Q06 
{

	public static void main(String[] args) 
	{
		Shape s1 = new Square(4);
		Shape t1 = new Triangle(3,5);
		Shape c1 = new Circle(7);
		
		System.out.println("Area of Square: " + s1.area());
		System.out.println("Area of Triangle: " + t1.area());
		System.out.println("Area of Circle: " + c1.area());
		
	}

}
