class abc
{
	public static void main(String args[])
	{
		gettingNumber s = new gettingNumber();
		s.gettingNumber();
		System.out.println("from main "+s.a);
	}
}

class holdingNumber
{
	
	
		int a=100;
	
}

class gettingNumber extends holdingNumber
{
	public void gettingNumber()
	{
		System.out.println("the number in secret class is "+a);
	}
}