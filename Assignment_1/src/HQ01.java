/*Write a Java program that takes as input three integers, a, b, and c, from the Java console
and determines if they can be used in a correct arithmetic formula (in the given order), like
“a + b = c,” “a = b − c,” or “a b = c.”∗ */

import java.util.Scanner;

public class HQ01 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        System.out.println("They are" + (checkFormula(a,b,c) ? "" : " not") + " in a correct formula.");

        sc.close();    
    }

    public static boolean checkFormula(int a, int b, int c)
    {
        if(a+b == c || a+c == b || b+c == a)
            return true;
        else if (a == b-c || a == c-b || b == a-c || b == c-a || c == a-b || c == b-a)
            return true;
        else if (a*b == c || a*c == b || b*c == a)
            return true;
        return false;
    }

}
