import java.io.*;
import java.util.*;
class abc
{
	public static void marsExploration(String s)
	{
		int count=0;
		int j=0;
        String s1 = new String();
        for(int i=0; i<s.length()/3; i++)
        {
            s1 = s.substring(j,j+3);
            j = j+3;
            if(s1.charAt(0) != 'S')
            {
                count++;
            }
            if(s1.charAt(1) != 'O')
            {
                count++;
            }
            if(s1.charAt(2) != 'S')
            {
                count++;
            }
        }
        System.out.println("Answer "+count);
	}
	public static void main (String args [])
	{
		Scanner sc = new Scanner (System.in);
		String s = new String();
		System.out.println("Enter a string: ");
		s = sc.nextLine();
		marsExploration(s); 
	}
}