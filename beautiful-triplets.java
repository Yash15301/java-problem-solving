import java.io.*;
import java.util.*;
 class abc 
 {
 	static void beautifulTriplets(int d, int[] arr)
 	{
 		Arrays.sort(arr);
        int count=0;
        int a=0; 
        int b=0;
        Integer[] arr1 = new Integer[arr.length];
        int x = 0;
        for (int value : arr) 
        {
            arr1[x++] = Integer.valueOf(value);
        }
        for(int i=0; i<arr.length; i++)
        {
           a=arr[i]+d;
           b=arr[i]+2*d;
           if(Arrays.asList(arr1).contains(a) && Arrays.asList(arr1).contains(b))
           {
               count++;
           } 
        }
        System.out.println("answer: " + count);
 	}
 	public static void main(String args[])
 	{
 		Scanner sc = new Scanner(System.in);
 		System.out.println("enter numbe of inputs: ");
 		int n= sc.nextInt();
 		int arr[] = new int[n];
 		System.out.println("enter elements: ");
 		for(int i=0; i<n; i++)
 		{
 			arr[i] = sc.nextInt();
 		}
 		System.out.println("expected difference: ");
 		int d = sc.nextInt();
 		beautifulTriplets(d,arr);
 	}
 }