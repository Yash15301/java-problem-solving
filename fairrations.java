import java.io.*;
import java.util.*;
class abc 
{
	public static void fairRations(List<Integer> B)
	{
		Collections.sort(B);
		int sum = 0;
		int count=0;
		for(int i=0; i<B.size(); i++)
		{
			sum = sum+B.get(i);
		}
		if (sum%2==1)
		{
			System.out.println("NO");
		}
		else
		{
			for(int i=0; i<B.size(); i++)
			{
				if(B.get(i)%2 != 0)
				{
					B.set(i, B.get(i)+1);
					B.set(i+1, B.get(i+1)+1);
					count = count+2;
				}
			} 
			System.out.println("Answer is "+count);
		}
		

	} 
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of inputs");
		int n = sc.nextInt();
		ArrayList<Integer> B = new ArrayList<>();
		System.out.println("Enter elements");
		for(int i=0; i<n; i++)
		{
			B.add(sc.nextInt());
		}
		fairRations(B);
	}
}