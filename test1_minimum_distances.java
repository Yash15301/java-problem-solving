import java.util.*;
import java.io.*;
class abc 
{
	public static void MinimumDistances(List<Integer> a)
	{
		int min = a.size();
        int temp = 0;
        int element = 0;
        int pos1=0;
        int pos2=0;
        for(int i=0; i<a.size()-1; i++)
        {
            element = a.get(i);
            pos1 = i;
            pos2=0;
            for(int j=i+1; j<a.size(); j++)
            {
                if(a.get(j) == element)
                {
                    pos2 = j;
                }
                
            }
            if(pos2 != 0)
            {
            	temp = Math.abs(pos1-pos2);
            }
            System.out.println("Element "+ a.get(i) + " position is " + pos1 +" " + pos2 + " difference is "+ temp);
            if (temp < min)
            {
                min = temp;
            }
        }
        if(min ==0)
        {
        	min = -1;
        }
        System.out.println("Answer is "+ min);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		System.out.println("Enter elements: ");
		int temp = 0;
		for (int i=0; i<n; i++)
		{
			temp =sc.nextInt();
			a.add(temp);
		}
		MinimumDistances(a);
	}

}