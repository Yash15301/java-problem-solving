import java.io.*;
import java.util.*;
 class abc
 {
 	public static int pickingNumbers(ArrayList<Integer> a) 
 	{
    // Write your code here
    	Collections.sort(a);
    	System.out.println(a);
    	int count=0;
    	int temp=1;
    	for(int i=0; i<a.size()-1; i++)
    	{
        	for(int j=i+1; j<a.size(); j++)
        	{
            	if(a.get(j)-a.get(i) <= 1)
            	{
                	temp++;
            	}
            
        	}
        	if(temp > count)
        	{
            	count=temp;
        	}
        	temp=1;
    	}
    	return count;

    }
 	public static void main(String args[])
 	{
 		Scanner sc = new Scanner(System.in);
 		System.out.println("enter number of inputs");
 		int n= sc.nextInt();
 		ArrayList <Integer> a = new ArrayList<>();
 		System.out.println("enter numbers ");
 		for(int i =0; i<n; i++)
 		{
 			a.add(sc.nextInt());
 		}
 		int result=pickingNumbers(a);
 		System.out.println("Result: "+result);
 	}
 }