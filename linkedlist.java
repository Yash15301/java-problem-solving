import java.util.*;
import java.io.*;
class abc
{
	public static void main(String args[])
	{
		int a;
		char choice;
		Scanner sc = new Scanner(System.in);
		LinkedList <Integer> ll =  new LinkedList<Integer>();
		System.out.println("Do you want to add elements? (y/n)");
		choice=sc.next().charAt(0);
		while(choice=='y')
		{
			System.out.println("enter element you want to add");
			a=sc.nextInt();
			ll.add(a);
			break;
		}
	}
}