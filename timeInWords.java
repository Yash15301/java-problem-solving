import java.util.*;
import java.io.*;

class abc
{
	static String timeInWords(int h, int m)
		{
			String nums[] = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","quarter","sixteen","seventeen","eighteen","ninteen","twenty","twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine","half"};
        
			String s1= new String();;
			if(m==0)
			{
				s1=nums[h]+" o'"+" clock";
            
			}
        
			else if(m<30 && m!=15)
			{
				s1=nums[m] +" "+ "minutes past"+" " + nums[h];
            
			}
        
			else if(m==30)
			{
				s1="half past " + nums[h];
            
			}
			else if (m==15)
			{
				s1="quarter past " + nums[h];
			}
        
			else if(m>30 && m!=45)
			{
				m=60-m;
				s1=nums[m] + " minutes to " + nums[h+1];
            
			}
        
			else if(m==45)
			{
				s1="quarter to " + nums[h+1];
            
			}	

			return s1;
		}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter hour:");
		int h= sc.nextInt();
		System.out.println("enter minute: ");
		int m= sc.nextInt();
		String result=timeInWords(h,m);
		System.out.println(result);
	}
}