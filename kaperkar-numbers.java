import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class abc 
{

    public static void kaprekarNumbers(int p, int q) 
    {
        
         boolean flag = false;//Denotes if a Kaprekar number has been found
         if(p == 1)//Handle the one case where a 1 digit square is a Kaprekar
            {
                System.out.print(p+" ");
                flag = true;
            }
        
        
        
        for(long i = p; i <= q; i++)
        {
           
            long squareLong = i * i;
            String squareStr = String.valueOf(squareLong);
            
            if(squareStr.length() > 1)
            {
                long left = Long.parseLong(squareStr.substring(0,(int)Math.ceil(squareStr.length()/2)));
                long right = Long.parseLong(squareStr.substring((int)Math.ceil(squareStr.length()/2), squareStr.length()));
                if(left+right == i)
                {
                    System.out.print(i+" ");
                    flag = true;
                }
            }
        }
        if(!flag)
        {
            System.out.println("INVALID RANGE");
        }
    }


  



    public static void main(String[] args) throws IOException 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter range: ");
       int p = sc.nextInt();
       int q = sc.nextInt();
       kaprekarNumbers(p,q);
    }
}
