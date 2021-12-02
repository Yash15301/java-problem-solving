import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Solution {

    // Complete the encryption function below.
    static void encryption(String s) {
        s = s.replaceAll(" ","");
        int k=0;
        double temp = Math.sqrt(s.length());
        int row = (int)Math.floor(temp);
        int column = (int)Math.ceil(temp);
		if(row*column > s.length())
		{
		}
		else
		{
			row=column;
		}
        char [][] arr = new char[row][column]; 
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column; j++)
            {
				if(k<s.length())
                {              
                    arr[i][j]=s.charAt(k);
                    k++;
                }
            }
        }
		
		
        String output = new String();
        StringBuilder sb = new StringBuilder();
       for(int i=0; i<column; i++)
        {
            for(int j=0; j<row; j++)
            {
               if(Character.isAlphabetic(arr[j][i]))
               {
                sb.append(arr[j][i]);
               }
               else
               {
                   sb.append("");
               }
            }
            sb.append(" ");
        }
        output = sb.toString();
        System.out.println(output);
		


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       System.out.println("enter string: ");
	   String s = new String();
	   s = scanner.nextLine();
	   encryption(s);
	   
    }
}
