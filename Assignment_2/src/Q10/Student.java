package Q10;
import java.util.Scanner;

public class Student 
{
	Scanner sc = new Scanner(System.in);
	private String name;
	private int roll;
	
	public void input() 
    {
        System.out.print("Enter student name: ");
        name = sc.nextLine();
        System.out.print("Enter roll no: ");
        roll = sc.nextInt();
    }

	void output()
	{
		System.out.println("Name: " + name);
		System.out.println("Roll: " + roll);
	}
	
}
