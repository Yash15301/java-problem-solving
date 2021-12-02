import java.util.*;

class abc
{	
	public static void main(String args[])
	{
		int count=0;
		int j,k;
		char a,b,temp;
		String wordlist[]={"india","brazil","japan","russia","vietnam"};
		System.out.println("guess the jumbled word");
		Random rand=new Random();
		int n=rand.nextInt(4);
		String shuffled=new String();
		shuffled=wordlist[n];
		char realshuffled[];
		for(int z=0;z<shuffled.length();z++)
		{
			realshuffled[z]=shuffled.charAt(z);
		}
		/*for(int i=0;i<=realshuffled.length();i++)
		{
			j=rand.nextInt(realshuffled.length-1);
			k=rand.nextInt(realshuffled.length-1);
			realshuffled[j]=temp;
			realshuffled[k]=realshuffled[j];
			temp=realshuffled[k];
			
		}
		System.out.println(realshuffled);*/
		System.out.println(realshuffled);
		System.out.println(shuffled);
		
		
	}
}