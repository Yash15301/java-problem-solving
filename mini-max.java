import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;


class abc{
     static void  miniMaxSum(int[] arr)
        {
            long sum=0;
            for(int i=0; i<arr.length; i++)
            {
                sum+=(arr[i]);
            }
        System.out.println((sum-Arrays.stream(arr).max().getAsInt() )+" "+  (sum-Arrays.stream(arr).min().getAsInt() ));
        }
   
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
			
        }

        miniMaxSum(arr);

        scanner.close();
      
    }
}