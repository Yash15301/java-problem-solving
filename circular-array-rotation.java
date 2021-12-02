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

    /*
     * Complete the 'circularArrayRotation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER k
     *  3. INTEGER_ARRAY queries
     */

    public static void  circularArrayRotation(List<Integer> a, int k, List<Integer> queries) 
    {
    // Write your code here
        int temp=0;
        ArrayList<Integer> result = new ArrayList<>();
        int size=a.size()-1;
        for(int i=0; i<k; i++)
        {
            temp=a.get(size);
            System.out.println("original array: "+ a);
            for(int j=a.size()-1; j<0; j++)
            {
                a.add(j, a.get(j-1));
            }
            a.add(0, temp);
            System.out.println("rotation number "+ k);
            System.out.println(a);
        }
    
        for(int x=0; x<queries.size(); x++)
        {
            result.add(x, a.get(queries.get(x)));
        }
        System.out.println(a);
        System.out.println(result);
    

    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> queries = new ArrayList<>();
        System.out.println("enter no. elements:");
        int n =sc.nextInt();
        int element=0;
        for(int i=0; i<n; i++)
        {
            element = sc.nextInt();
            a.add(element);
        }
        System.out.println("enter no. of rotations: ");
        int k = sc.nextInt();
        System.out.println("enter query number: ");
        int f = sc.nextInt();
        int number = 0;
        for(int i=0; i<f; i++)
        {
            number = sc.nextInt();
            queries.add(number);
        }
        circularArrayRotation(a,k,queries);
    }

}

