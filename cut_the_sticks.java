import java.io.*;
import java.util.*;

class abc
{
	public static void cutTheSticks(List<Integer> arr) 
	{
    	// Write your code here
    	ArrayList<Integer> result = new ArrayList<>();
   		Collections.sort(arr);
    	int x=0; 
    
    	while(arr.size()!=0)
    	{
        	result.add(arr.size());
        	int min = Collections.min(arr);
        	System.out.println("sorted array is: "+arr);
        	for(int i=0; i<arr.size(); i++)
        	{
            	arr.set(i, arr.get(i)-min);
            	
        	}
        	arr.removeIf(z -> z.equals(0));
        	System.out.println("min is: " + min);
        	System.out.println(arr);
        }
    	System.out.println(result);

    }
       	
	

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		System.out.println("enter number of inputs: ");
		int n=sc.nextInt();
		System.out.println("enter numbers");
		int element=0;
		for(int i=0; i<n; i++)
		{
			element = sc.nextInt();
			arr.add(element);
		}
		cutTheSticks(arr);

	}

}