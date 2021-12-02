import java.io.*;
import java.util.*;

class abc
{
	static String superReducedString(String s) {
        String str = new String();
        int n=s.length();
        for(int j=0; j<n/2; j++)
        {
            for(int i=0; i<s.length()-1; i++)
            {
                if(s.charAt(i) == s.charAt(i+1))
                {
                    s= s.substring(0,i) + s.substring(i+2);
                }
            }
            
        }
        if(s.isEmpty())
            {
                str="Empty String";
                return str;
            }
            else
            {
                return s;
            }

    }
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String s = sc.nextLine();
		String result=superReducedString(s);
		System.out.println(result);
	}
}