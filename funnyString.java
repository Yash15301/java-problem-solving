import java.util.*;
import java.io.*;
class abc
{
	 static String funnyString(String s) 
	 {
        ArrayList <Integer> a1 = new ArrayList<>();
        ArrayList <Integer> a2 = new ArrayList<>();
        String s1 = new String(s);
        StringBuffer s2 = new StringBuffer(s);
        s2.reverse();
        for(int i=0; i<s1.length()-1; i++)
        {
            a1.add(Math.abs((int)s1.charAt(i)-(int)s1.charAt(i+1)));
        }
        for(int i=0; i<s2.length()-1; i++)
        {
            a2.add(Math.abs((int)s2.charAt(i)-(int)s2.charAt(i+1)));
        }
		System.out.println(a1);
		System.out.println(a2);
        if(a1.equals(a2))
        {
            return "Funny";
        }
        else
        {
            return "Not Funny";
        }
	 }
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string:");
		String s = sc.nextLine();
		String result = funnyString(s);
		System.out.println(result);
	}
}