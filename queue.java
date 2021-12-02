import java.util.*;
import java.io.*;

class abc
{
	static void add_queue(Queue<Integer> queue, int input)
	{
		queue.add(input);
		System.out.println("element inserted");
	}
	
	static void remove_head(Queue<Integer> queue)
	{
		int head=queue.remove();
		System.out.println(head + " removed");
	}
	
	static void view_head(Queue<Integer> queue)
	{
		System.out.println(queue.peek());
	}
	
	static void view_queue(Queue<Integer> queue)
	{
		System.out.println("elements of queue are " + queue);
	}
	
	static void view_size(Queue<Integer> queue)
	{
		System.out.println("size of queue is " + queue.size()); 
	}
	
	public static void main(String args[])
	{
		Queue<Integer> queue = new LinkedList<>();
		final Scanner sc = new Scanner(System.in);
		
		int i=0,input;
		String choice = new String();
		while(i <= 0)
		{
			System.out.println("Enter operation name that you want to perform:");
			choice=sc.nextLine();
			
			
			switch(choice)
			{
				case "add":
					System.out.println("enter element: ");
					input=sc.nextInt();
					add_queue(queue,input);
					break;
					
				case "remove head":
					remove_head(queue);
					break;
					
				case "view head":
					view_head(queue);
					break;
					
				case "view queue":
					view_queue(queue);
					break;
					
				case "view size":
					view_size(queue);
					break; 
					
				case "exit":
					i=1;
					break;
			}
		}
	}
}