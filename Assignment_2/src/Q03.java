/*Define a class called Student with instance variables Roll, Name, DSA_Mark. Also, the class 
consists of instance methods getdata( ), showdata( ) to provide input to the instance variable 
and to display the value of instance variable. Write a program to create the details of 5 students. 
Display the information of the students who has secured the highest DSA_Mark. */

import java.util.Scanner;

class Student
{
	Scanner sc = new Scanner(System.in);
	int roll;
	String name;
	int dsa_mark;
	
	void GetData()
	{
		this.roll = sc.nextInt();
		this.name = sc.next();
		this.dsa_mark = sc.nextInt();
	}
	
	void ShowData()
	{
		System.out.print("Roll: " + roll + "\t");
		System.out.print("Name: " + name + "\t");
		System.out.println("DSA Mark: " + dsa_mark);
	}
	
	
}


public class Q03 
{

	public static void main(String[] args) 
	{
		
		Student[] studArr = new Student[5];
		
		
		for(int i=0; i<studArr.length; i++)
		{
			studArr[i] = new Student();
			studArr[i].GetData();
		}
		
		for(int i=0; i<studArr.length; i++)
		{
			studArr[i].ShowData();
		}
		
		int maxPos = 0;
		
		for(int i=0; i<studArr.length-1; i++)
		{
			if(studArr[i].dsa_mark < studArr[i+1].dsa_mark)
				maxPos = i+1;
		}

		System.out.println(studArr[maxPos].name + " scored the highest mark.");
	

	}

}
