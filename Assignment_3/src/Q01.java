/*Write a Java program to read your lucky number from keyboard. Treat –ve no. as
NumberFormatException. Write appropriate Exceptional handler. */
import java.util.Scanner;

public class Q01 
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your lucky number: ");
        int num = sc.nextInt();

        try {
            if(num < 0)
            {
                sc.close();
                throw new NumberFormatException("Negative Number!!");
            }
            

        } catch (NumberFormatException e) 
        {
            System.out.println(e);
        }

        
    }
}
