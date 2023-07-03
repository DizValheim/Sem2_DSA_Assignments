/*Write a java program to print an array of different type using a single Generic method. The
signature of printArray method is given below.
public static < E > void printArray( E[] inputArray) */

import java.util.Scanner;

public class Q04 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter array elements: ");
        Integer [] arr =new Integer[5];
        for (int i = 0; i < arr.length; i++) 
            arr[i] = sc.nextInt();
        System.out.println("Integer Array Contains:");
        printArray(arr);

        System.out.println("Enter array elements: ");
        Double [] douArr =new Double[5];
        for (int i = 0; i < douArr.length; i++) 
            douArr[i] = sc.nextDouble();
        System.out.println("Double Array Contains:");
        printArray(douArr);

        sc.close();
    }    

    public static <E> void printArray(E[] inputArray)
    {
        
        for (int i = 0; i < inputArray.length; i++) 
            System.out.println(inputArray[i] + " ");
        System.out.println();
    }

}
