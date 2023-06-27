package Q10;
import java.util.Scanner;
import Pack2.Sports;

public class Test extends Student
{
    Scanner sc = new Scanner(System.in);
    int mark1;
    int mark2;

    public void input() 
    {
        super.input();
        System.out.print("Enter mark1: ");
        mark1 = sc.nextInt();
        System.out.print("Enter mark2: ");
        mark2 = sc.nextInt();
		
    }
    public void output() 
    {
        super.output();
        System.out.print("Mark 1: " + mark1+"\tMark 2: "+ mark2);
    }

}

class GrandTotal extends Test implements Sports 
{  
    public void input() 
    {
    	super.input();
    }

	public void output()
	{
		super.output();
        System.out.println("\nGrandTotal: " + (mark1+mark2));
	}
	
}
