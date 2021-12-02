import java.util.*;
import java.io.*;

class abc
{
	static void larrysArray(int[] A) 
	{
        int[] B = A.clone();
        int temp=0;
		Arrays.sort(A);
        String result = new String();
		//System.out.println("original");
		//System.out.println(Arrays.toString(A));
		//System.out.println(Arrays.toString(B));
		//System.out.println("after");
        for(int i=0; i<A.length; i++)
        {
            if(Arrays.equals(B,A))
            {
                result="YES";
				System.out.println("equal here");
				System.out.println(Arrays.toString(A));
				System.out.println(Arrays.toString(B));
                break;
            }
            
            else
            {
                temp = B[0];
                for(int j=0; j<B.length-1; j++)
                {
                    B[j] = B[j+1];
                }
                B[B.length-1] = temp;
				System.out.println(Arrays.toString(B));
            }
        }
        if(result.isEmpty())
        {
            result="NO";
        }
		System.out.println(result);
	}
		
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number of inputs: ");
		int n = sc.nextInt();
		int[] A = new int[n];
		System.out.println("enter inputs");
		for(int i=0; i<n; i++)
		{
			A[i]=sc.nextInt();
		}
		larrysArray(A);
	}
}