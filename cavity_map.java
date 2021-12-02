import java.util.*;
import java.io.*;

class abc
{
	static String[] cavityMap(String[] grid) {
        for(int i=1; i<grid.length-1; i++)
        {
            for(int j=1; j<grid[i].length()-1; j++)
            {
                if((int)grid[i].charAt(j)>(int)grid[i].charAt(j-1) && (int)grid[i].charAt(j)>(int)grid[i].charAt(j+1))
                {
                    if((int)grid[i].charAt(j)>(int)grid[i-1].charAt(j))
                    {
                        if((int)grid[i].charAt(j)>(int)grid[i+1].charAt(j))
                        {
                            grid[i]=grid[i].substring(0,j) + 'X' + grid[i].substring(j+1);
                        }
                    }
                }
                
            }
        }
        
        return grid;
    }
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter n: ");
		int n=sc.nextInt();
		String[] grid = new String[n];
		System.out.println("enter strings: ");
		for(int i=0; i<n; i++)
		{
			grid[i]=sc.nextLine();
		}
		String result[]=cavityMap(grid);
		System.out.println(Arrays.toString(result));
		
	}
}