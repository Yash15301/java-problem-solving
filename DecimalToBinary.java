import java.io.*;
import java.util.*;
class abc
{
	public static void main(String args[])
	{
		int n=439;
		int binary;
		char str[];
		Integer arr[] = new Integer[100];
		str=Integer.toBinaryString(n).toCharArray();
		for(int i=0;i<str.length;i++)
		{
			arr[i]=Integer.parseInt(String.valueOf(str[i]));
		}
		int someIndex = Arrays.asList(arr).indexOf(null);
		arr = Arrays.copyOfRange(arr,0,someIndex);
		/*for(int i=str.length; i<100; i++)
		{
			arr[i]=null;
		}*/
		String final_binary=Arrays.toString(arr);
		System.out.println(final_binary);
		System.out.println(arr.length);
		
		int count=0;
		int k=0;
		int max=0;
		//int Array_ToFindMax = new int [20];
		while(k<arr.length-1)
		{
			if(arr[k]==1)
			{
				if(arr[k+1]==1)
				{
					count++;
				}
				else
				{
					max=count;
					count=0;
					
				}
				max=count;
				k++;
				
			}
			else
			{
				k++;
			}
		}
		
		//max=Arrays.stream(count).max().getAsInt();
		//System.out.println("Maximum consecutive number of 1's are: "+max);
	
			System.out.println(max);
		
		
		
	}
}

/*
int binary[] = new int[40];
     int index = 0;
     while(num > 0){
       binary[index++] = num%2;
       num = num/2;
*/

/*
Hackerrank writeup:-

String[] groupings = Integer.toBinaryString(n).split("0");
        int max = 0;
        for(String s : groupings){
            if(max < s.length()){
                max = s.length();
            }
        }
        System.out.println(max);




*/