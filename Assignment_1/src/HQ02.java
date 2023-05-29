/*Write a Java program that takes all the lines input to standard input and writes them to
standard output in reverse order. That is, each line is output in the correct order, but the
ordering of the lines is reversed. */
import java.util.Scanner;

public class HQ02 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();
        String[] lineArr = new String[n];

        System.out.print("Enter the lines: ");
        for (int i = 0; i < lineArr.length; i++) 
        {
            lineArr[i] = sc.next();
        }

        System.out.println("The Lines in reverse order: ");
        for (int i = lineArr.length-1; i >= 0 ; i--) 
        {
            System.out.println(lineArr[i]);
        }
        
        

        sc.close();
    }
}
