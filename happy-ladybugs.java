import java.io.*;
import java.util.*;
// if all frequencies are >= 2 and a _ is present--done
//     YES
// else if they are >= 2 and no _ is present
//     if it is already ordered
//         YES
//     else
//         NO
// else
//     NO
 
class abc 
{
	static void ladyBugs(String s)
	{
		String result = new String();
		int count=0;
		int count2=0;
		int underscore_isPresent = 0;
		for(int i=0; i<s.length(); i++)
		{
			for(int j=0; j<s.length(); j++)
			{
				if(s.charAt(i) == '_')
				{
					count = 2;
					break;
				}
				else if(s.charAt(i) == s.charAt(j))
				{
					count ++;
				}
			}
			if(count < 2)
			{
				result = "NO";
				break;				
			}
			count = 0;
		}
		if(underscore_isPresent >=2)
			{
				result ="YES";
			}

		else if(underscore_isPresent < 2)
		{
			for(int i=1; i<s.length()-1; i++)
			{
				if(s.charAt(i) == s.charAt(i-1) || s.charAt(i) == s.charAt(i+1))
				{
					count2++;
				}
			}
			if(s.charAt(s.length()-1) == s.charAt(s.length()-2) && s.charAt(0) == s.charAt(1))
			{
				count2 = count2+2;
			}
			if(count2 == s.length()-1)
			{
				result = "YES";
			}
			if(count2 != s.length()-1)
			{
				result = "NO";
			}
		}
		System.out.println(result);

	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = new String();
		System.out.println("Enter a string: ");
		s = sc.nextLine();
		ladyBugs(s);
	}
}