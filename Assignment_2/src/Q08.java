/*Define an interface DetailInfo to declare methods display ( ) & count ( ). Another class Person
contains a static data member maxcount, instance member name & method display ( ) to display 
name of a person, count the no. of characters present in the name of the person. */
interface DetailInfo
{
	void Display();
	void Count();
	
}

class Person8 implements DetailInfo
{
	static int maxcount;
	String name;
	
	Person8(String name) 
	{
		this.name = name;
	}
	
	public void Display()
	{
		System.out.println("Name: " + name + "\nCount: " + maxcount);
	}
	
	public void Count()
	{
		maxcount = name.length();
	}
}


public class Q08 {

	public static void main(String[] args) 
	{
		
		Person8 p1 = new Person8("Aaron");
		p1.Count();
		p1.Display();

	}

}
