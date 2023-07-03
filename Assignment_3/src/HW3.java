/*Write a recursive Java method that determines if a string s is a palindrome, that is, it is
equal to its reverse. 
Examples of palindromes include 'racecar' and 'gohangasalamiimalasagnahog' */

import java.util.Scanner;

public class HW3
{
    static boolean isPalindrome(String str,int start, int end)
    {
        if (start == end)
            return true;
        else if ((str.charAt(start)) != (str.charAt(end)))
            return false;
        else if (start < end + 1)
            return isPalindrome(str, start + 1, end - 1); 
        return true;
    } 

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String str = sc.nextLine(); 

        System.out.println(isPalindrome(str,0,str.length()-1)?"Yes it is a pallindrome String.":"No it is not a pallindrome String.");

        sc.close();
    }
}