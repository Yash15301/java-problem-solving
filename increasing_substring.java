import java.io.*;
import java.util.*;
class abc
{
    public static void inc_sub(String S)
    {
        int temp=1;
        ArrayList<Integer> result = new ArrayList<>(); 
        for(int i=0; i<S.length()-1; i++)
        {
            for(int j=i; j<S.length()-1; j++)
            {
                if((int)S.charAt(j) < (int)S.charAt(j+1))
                {
                    temp++;
                }
                else
                {
                    break;
                }
            }
            result.add(temp);
            temp=1;
        }
        for(int i=0; i<result.size(); i++)
        {
            System.out.println(result.get(i) + " ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
            
            String S = new String();
			S = sc.nextLine();
            inc_sub(S);
        
    }
}