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
		int underscore_isPresent = 0;
		int all_frequence_is_even = 1; 
		if(s.length() == 1 && s.charAt(0) != '_')
		{
			result ="NO";
		}
		else
		{
			for(int i=0; i<s.length(); i++)
			{
				for(int j=0; j<s.length(); j++)
				{
				if(s.charAt(i) == '_')
					{
						count = 2;
						underscore_isPresent  = 1;
						break;
					
					}
				
					else if(s.charAt(i) == s.charAt(j))
					{
						count ++;
					}
				}
				if(count<2)
				{
					result = "NO";
					all_frequence_is_even = 0;
					break;
				}
				count = 0;
			}
			if(result != "NO")
			{	
				all_frequence_is_even = 1;
			}

			if(all_frequence_is_even == 1 && underscore_isPresent  == 1)
			{
				result = "YES";
			}

			else if(underscore_isPresent  == 0)
			{
				if(s.charAt(0) == s.charAt(1) && s.charAt(s.length()-2) == s.charAt(s.length()-1))
				{
					for(int i=1; i<s.length()-1; i++)
					{
						if(s.charAt(i) == s.charAt(i+1) || s.charAt(i) == s.charAt(i-1))
						{

						}
						else
						{
							result = "NO";
						}
					}
				}
				else 
				{
				result = "NO";
				}
				if(result != "NO")
				{
					result = "YES";
				}
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