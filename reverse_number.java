class abc 
{
	public static void main(String args[])
	{
		int num = 20,digit,reversed=0;
		while(num != 0)
         {
            digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
		System.out.println(reversed);
	}
}