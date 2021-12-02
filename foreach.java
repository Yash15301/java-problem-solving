import java.util.*;
public class foreach
{
	public static void main(String[] args)
	{
		int[] a={1,2,3,4,5,6,7,8,9,10};
		Arrays.stream(a).forEach((e) -> {System.out.println(e); });
		
	}
}