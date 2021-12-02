import java.io.*;
class MyException extends Exception
{
	MyException(String msg)
	{
		super(msg);
	}
}

class abc
{
	public static void main(String args[])
	{
		int age=15;
		try
		{
			if(age<21)
			{
				throw new MyException("age requirement not met");
			}
		}
		catch(MyException e)
		{
			System.out.println("error:"+e.getMessage());
		}
		finally
		{
			System.out.println("end of block");
		}
	}
}