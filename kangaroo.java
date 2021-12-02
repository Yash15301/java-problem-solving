import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        int estimated=x1+v1*x2+v2;
        int distance_k1=x1+v1;
        int distance_k2=x2+v2;
        int count=0;

        while (distance_k1<=estimated || distance_k2<=estimated)
        {
            if(distance_k1==distance_k2)
            {
                count++;
            }
            distance_k1=distance_k1+v1;
            distance_k2=distance_k2+v2;
        }
        if(distance_k1==distance_k2)
        {
            count++;
        }

        if(count>=1)
        {
            return("YES");
        }
        else
        {
            return("NO");
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}