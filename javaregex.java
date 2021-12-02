import java.util.*;
import java.io.*;

class demo
{

    public static void check1(String ip)
	{
		boolean isInteger=isInteger(ip.charAt[1]);
		if(isInteger)
		{
		
		}
		else
		{
			System.out.println("wrong input");
		}
	}	



	public static void check2(String ip)
	{
		int counter;
		for(int i=0;i<=ip.length();i++)
		{
			counter=i+1;
			if(ip.charAt[i]=='.')
			{
				counter=0;
			}
		
			if(counter>3)
			{
				System.out.println("incorrect ip");
			}
		}

	}




	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your ip to validate");
		String ip=sc.next();
		
	}
}

