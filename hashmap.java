import java.util.*;
class abc
{
	public static void main(String args[])
	{
		HashMap<String,Integer> phoneBook= new HashMap<String,Integer>();
		String name="yash";
		int phone=12345678;
	
		phoneBook.put(name,phone);
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		Integer PhoneNumber=phoneBook.get(s);
		System.out.println(PhoneNumber);
	}
}