import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.lang.*;

class abc {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
        /*
         * Write your code here.
         */
         int front_page_count,back_page_count,a=1,b=n,count=0;
         while(a<=p)
         {
             a=a+2;
             count++;
         } 
         front_page_count=count;
         count=0;
         while(b>=p)
         {
             b-=2;
             count++;
         }
         if(n==p)
         {
             back_page_count=0;
         }
		 else if(n%2==0)
		 {
			 back_page_count=count;
		 }
         else
         {
             back_page_count=count-1;
         }
         
         System.out.println(front_page_count);
          System.out.println(back_page_count);
         return(Math.min(front_page_count,back_page_count));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
       

        int p = scanner.nextInt();
       

        int result = pageCount(n, p);

        System.out.println(result);

       
    }
}
