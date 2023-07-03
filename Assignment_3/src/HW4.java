/*Given an unsorted array, A, of integers and an integer k, write recursive program using Java
for rearranging the elements in A so that all elements less than or equal to k come before
any elements larger than k. */

import java.util.Scanner;

public class HW4 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int n=sc.nextInt();

        int[] A = new int[n];
        System.out.println("Enter the values in the array : ");
        for(int i=0;i<n;i++)
            A[i]=sc.nextInt();

        System.out.print("Enter k : "); 
        int k = sc.nextInt();

        RearrangeArray(A, k);
        System.out.println("After rearrangement the array :");
        for(int i=0;i<n;i++)
        System.out.print(A[i]+" ");
        
        sc.close();        
    }

    public static void RearrangeArray(int[] A, int k) 
    {
        HalfQuicksort(A, k, 0, A.length - 1);
    }

    public static void HalfQuicksort(int[] A, int k, int start, int end) 
    {
        if (start >= end)
            return; 
        int cutIndex = GetPivot(A, k, start, end);
        HalfQuicksort(A, k, start, cutIndex - 1);
        HalfQuicksort(A, k, cutIndex + 1, end);
    }

    public static int GetPivot(int[] A, int k, int start, int end) 
    {
        // int pivot = A[end];
        int i = start - 1;
        for (int j = start; j <= end - 1; j++) 
            if (A[j] <= k) 
            {
                i++;
                swap(A, i, j);
            }
        swap(A, i + 1, end);
        return i + 1;
    }

    public static void swap(int[] A, int i, int j) 
    {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
