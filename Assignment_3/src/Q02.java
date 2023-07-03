/*Assign your favourite colours in an array. Identify 2 exceptions that may be generated & write
exceptional handler in Java. Also, display the four colours after handling any 2 exceptions. */
import java.util.Scanner;

public class Q02 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        String[] colours = new String[4];
        System.out.println("Enter four colours:");

        for (int i = 0; i < colours.length; i++) 
        {
            colours[i] = sc.nextLine();
        }

        try 
        {
           Integer.parseInt(colours[0]);
        } 
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
        try
        {
            System.out.println("Enter one more color  ");
            colours[5] = sc.nextLine();
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
             System.out.println(e);
        }
        System.out.println("The colours entered are ");
        for(int i=0;i<colours.length;i++)
        System.out.println(colours[i]);

        sc.close();
    }
}
