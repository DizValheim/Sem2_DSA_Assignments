/*Write a java method using Generics to count the occurrence of an element in an array of any
type. The signature of count method is given below.
public static <T> int count(T[] array, T item) */

import java.util.Scanner;

public class Q05 
{
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        Integer [] arr = new Integer[5];
        for (int i = 0; i < arr.length; i++) 
            arr[i] = sc.nextInt();
        System.out.print("Enter the element to search: ");
        int element = sc.nextInt();
        int c = count(arr, element);
        System.out.println("Count is: " + c);
        sc.close();
    }
    
    public static <T> int count(T[] array, T item)
    {
        int count = 0;
        for (int i = 0; i < array.length; i++) 
        {
            if(array[i].equals(item))
                count++;
        }
        return count;
    }


}
