/*Create a class Student having two instance variable name and mark. Enter mark, name of the 
student. If mark is more than 100, create exception MarksOutOfBoundException & throw it 
using Java. Display the customised message Mark can’t be greater than 100 for the exception */

import java.util.Scanner;

class MarksOutOfBoundException extends Exception
{
    
	private static final long serialVersionUID = 1L;

	MarksOutOfBoundException(String message)
    {
        super(message);
    }
}

class Student 
{
    String Name;
    int mark;

    Student (String Name, int mark)
    {
        this.Name = Name;
        this.mark = mark;
    }

    Student()
    {

    }

}

public class Q03 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();

        System.out.print("Enter your name: ");
        s1.Name = sc.next();
        
        try 
        {
            System.out.print("Enter marks: ");
            s1.mark = sc.nextInt();
            if(s1.mark > 100)
            {
                sc.close();
                throw new MarksOutOfBoundException("Mark can't be greater than 100");
            }
        } catch (MarksOutOfBoundException e) 
        {
            System.out.println(e);
        }


        sc.close();
    }
}
