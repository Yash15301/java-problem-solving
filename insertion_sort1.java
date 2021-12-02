import java.util.*;
import java.io.*;
class abc
{
	 static void insertionSort1(int n, int[] ar) {
        int sort = ar[ar.length - 1];
        int i;
        for (i = ar.length - 2; (i >= 0) && (ar[i] > sort); i--) 
		{
            ar[i + 1] = ar[i];
            printArray(ar);
        }
        ar[i + 1] = sort;
        printArray(ar);



    }
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
		
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number of elements");
			int n = sc.nextInt();
			System.out.println("enter elements");
			int arr[] = new int[n];
			for(int i=0 ; i<n; i++)
			{
				arr[i]=sc.nextInt();
			}
			insertionSort1(n,arr);
		}
}