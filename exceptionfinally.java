class abc
{
	public static void main(String args[])
	{
		int a=10,b=1,c;
		try
		{
			c=a/0;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("error:"+e);
		}
		
		finally
		{
			if(b!=1)
			{
				System.out.println("value of b is not 1");
			}
			else
			{
				System.out.println("value of b is 1");
			}
		}
	}
}