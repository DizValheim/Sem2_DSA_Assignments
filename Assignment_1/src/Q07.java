/*Write a java program to find the maximum and minimum and how many times they both occur
in an array of n elements. Find out the positions where the maximum first occurs and the
minimum last occurs */

import java.util.Scanner;

public class Q07 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of elements of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter elements of the array: ");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = sc.nextInt();
		}

		int max, min, maxCount, minCount, maxPos, minPos;
		max = min = arr[0];
		maxCount = minCount = 1;
		maxPos = minPos = 0;

		for (int i = 1; i < arr.length; i++) 
		{
			if(arr[i] > max)
			{
				max = arr[i];
				maxCount = 1;
				maxPos = i+1;
			}
			else if (arr[i] == max)
			{
				maxCount++;
			}

			if(arr[i] < min)
			{
				min = arr[i];
				minCount = 1;
				
			}
			else if (arr[i] == min)
			{
				minCount++;
				minPos = i+1;
			}

				
		}

		

		System.out.println("Maximum element of Array is "+ max +" and occurs " + maxCount + " times.");
		System.out.println("Minimum element of Array is "+ min +" and occurs " + minCount + " times.");

		System.out.println("First occurrence of maximum element is at position " + maxPos + ".");
		System.out.println("First occurrence of minimum element is at position " + minPos + ".");

		sc.close();
	}
	
	

}