import java.io.*;
import java.util.*;
//import java.lang.String.contains();

class abc 
{
	public static void hackerrankInString(String s)
	{
		int count = 0;
		int original_count=0;
		int index=0;
		String compare = new String();
		String hackerrank = "hackerrank";
		String result = new String();
		for(int i=0; i<hackerrank.length(); i++)
		{
			original_count++;
			for(int j=index; j<s.length(); j++)
			{
				if (hackerrank.charAt(i) == s.charAt(j))
				{
					count++;
					index = j+1;
					break;
				}
			}
			if(original_count != count)
			{
				result = "NO";
				break;
			}
		}
		if(count == hackerrank.length())
		{
			result = "YES";
		}
		System.out.println(result);

	} 
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = new String();
		System.out.println("Enter a string: ");
		s = sc.nextLine();
		hackerrankInString(s);
	}
}