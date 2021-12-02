import java.io.*;
import java.util.*;
class abc 
{
 	public static void gem_stones(List<String> arr)
 	{
 		String s1 = new String();
 		String s2 = new String();
 		int count = 0;
 		int result = 0;
 		s1 = arr.get(0);
 		for(int i=0; i<s1.length(); i++)
 		{
 			for(int j=1; j<arr.size(); j++)
 			{
 				s2 = arr.get(j);
 				System.out.println("s2 is "+s2);
 				if(s2.indexOf(s1.charAt(i)) != -1)
 				{
 					count++;
 				}
 				else
 				{
 					break;
 				}
 			}
 			if(count == arr.size()-1)
 			{
 				result++;
 			}
 			count = 0;
 		}
 		System.out.println("Gems are: "+ result);
 	}
 	public static void main(String args[])
 	{
 		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter number of inputs: ");
 		int n = sc.nextInt();
 		ArrayList<String> arr = new ArrayList<>();
 		System.out.println("Enter inputs: ");
 		String s = new String();
 		for(int i=0; i<n; i++)
 		{
 			s = sc.next();
 			arr.add(s);
 		}
 		System.out.println("arraylist is "+arr);
 		gem_stones(arr);
 	}
}