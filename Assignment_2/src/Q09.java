/*Define an interface DetailInfo to declare methods display ( ) & count ( ). Another class Person
contains a static data member maxcount, instance member name & method display ( ) to display 
name of a person, count the no. of characters present in the name of the person. */
class Student9 
{
	int roll_number;
	String name;
	String course;
	
	void input_Student(int roll_number, String name, String course)
	{
		this.roll_number = roll_number;
		this.name = name;
		this.course = course;
	}
	
	void display_Student()
	{
		System.out.println("Name: " + name + "\nRoll No: " + roll_number + "\nCourse: " + course);
	}
	
}

class Exam extends Student9
{
	int mark1, mark2, mark3;
	
	void input_Marks(int mark1, int mark2, int mark3)
	{
		
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	
	void display_Result()
	{
		display_Student();
		System.out.println(mark1 + "\t" + mark2 + "\t" + mark3 + "\t");
	}
	
}

public class Q09 
{

	public static void main(String[] args) 
	{
		
		
		Exam [] sArr = new Exam[5];
		
		for (int i = 0; i < sArr.length; i++) 
		{	sArr[i] = new Exam();
			sArr[i].input_Student(34, "Pramila", "CSE"); 
			sArr[i].input_Marks(90, 90, 88);
			sArr[i].display_Result();
		}

	}

}
