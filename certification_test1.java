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



class Result {

    /*
     * Complete the 'stringAnagram' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY dictionary
     *  2. STRING_ARRAY query
     */

    public static List<Integer> stringAnagram(List<String> dictionary, List<String> query) 
    {
        
    // Write your code here
    String s1;
    String s2;
    ArrayList<Integer> answer = new ArrayList<Integer>();
    int count=0;
    int temp=0;
    char a;
    for(int i=0; i<query.size(); i++)
    {
        s1 = query.get(i);
        for(int j=0; j<dictionary.size(); j++)
        {
            s2 = dictionary.get(j);
            for(int k=0; k<s1.length(); k++)
            {
                a = s1.charAt(k);
                if(s2.indexOf(a) > -1 )
                {
                    temp++;
                    continue;
                    
                }   
                else
                {
                    break;    
                } 
            }
            
            if(temp == s1.length())
            {
                count++;
            }
            temp=0;
        }
        answer.add(count);
        count=0;
    }
    return answer;
    }
}

public class Solution {