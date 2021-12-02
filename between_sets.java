import java.util.*;
import java.io.*;

class abc
{
	 public static int getTotalX(List<Integer> a, List<Integer> b) 
	 {
    	// Write your code here
    	Collections.sort(a);
    	Collections.sort(b);
    	int count=0;
    	int temp=0;
    	for(int i=a.get(a.get(a.size()-1)); i<=b.get(0); i++)
    	{
        	for(int j=0; j<b.size(); j++)
        	{
            	if(b.get(j)%i==0)
            	{
                	temp++; 
            	}
            	else
            	{
                	break;
            	}
        	}
        	if(temp==b.size())
        	{
            	count++;
        	}
        	temp=0;
    	}
    	return count;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		int x=0;
		System.out.println("enter no. of elements for array a: ");
		int p=sc.nextInt();
		System.out.println("enter elements ");
		for(int i=0; i<p; i++)
		{
			x=sc.nextInt();
			a.add(x);
		}
		System.out.println("enter number of elements for b: ");
		int q=sc.nextInt();
		System.out.println("enter elements ");
		for(int i=0; i<q; i++)
		{
			x=sc.nextInt();
			b.add(x);
		}
		int result=getTotalX(a,b);
		System.out.println(result);
	}
}