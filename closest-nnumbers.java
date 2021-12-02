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

class abc {

    

    public static void closestNumbers(List<Integer> arr) {
        int difference = Integer.MAX_VALUE;
        int temp = Integer.MAX_VALUE;
        ArrayList<Integer> result = new ArrayList<>();
        Collections.sort(arr);
        // for(int i=0; i<arr.size()-1 ;i++)
        // {
        //     for(int j=i+1; j<arr.size(); j++)
        //     {
        //         temp = Math.abs(arr.get(j)-arr.get(i));
        //         if(temp < difference)
        //         {
        //             difference = temp;
        //         }
        //     }
        // }
        //  for(int i=0; i<arr.size()-1 ;i++)
        // {
        //     for(int j=i+1; j<arr.size(); j++)
        //     {
        //         if(Math.abs(arr.get(j) - arr.get(i)) == difference)
        //         {
        //             result.add(arr.get(i));
        //             result.add(arr.get(j));
        //         }
        //     }
        // }
        // Collections.sort(result);
        // return result;
        for(int i=0; i<arr.size()-1; i++)
        {
            temp = Math.abs(arr.get(i+1) - arr.get(i));
            if(temp < difference)
            {
                difference = temp;
            }
        }
        for(int i=0; i<arr.size()-1; i++)
        {
            if(Math.abs(arr.get(i+1)-arr.get(i)) == difference)
            {
                result.add(arr.get(i));
                result.add(arr.get(i+1));
            }
        }
        System.out.println(result);
        
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter number of inputs: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        for(int i=0; i<n; i++)
        {
            arr.add(sc.nextInt());
        }
        closestNumbers(arr);
    }

}


