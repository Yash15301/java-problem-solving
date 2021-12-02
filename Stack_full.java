import java.util.*;
import java.io.*;

class abc
{
	static void stack_push(Stack<Integer> stack, int element)
	{
		stack.push(element);
	}
	
	static void stack_pop(Stack<Integer> stack)
	{
		Integer x = (Integer)stack.pop();
		System.out.println("element popped: " + x);
	}
	
	static void stack_peek(Stack<Integer> stack)
	{	
		System.out.println("element on top is: " + stack.peek());
	}
	
	static void stack_search(Stack<Integer> stack, int element)
	{
		Integer pos = (Integer) stack.search(element); 
  
        if(pos == -1)
		{			
            System.out.println("Element not found"); 
		}
        else
		{
            System.out.println("Element is found at position: " + pos);
		}
	}
	
	static void stack_view(Stack<Integer> stack)
	{
		Iterator i = stack.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	
	
	
	public static void main(String args[])
	{
		Stack<Integer> stack = new Stack<Integer>();
		final Scanner sc = new Scanner(System.in);
		
		
		int i=0,input;
		String choice = new String();
		while(i <= 0)
		{
			System.out.println("Enter operation name that you want to perform:");
			choice=sc.nextLine();
			
			switch(choice)
			{
				case "push":
					System.out.println("enter element:");
					input=sc.nextInt();
					stack_push(stack,input);
					break;
				
				case "pop":
					stack_pop(stack);
					break;
					
				case "peek":
					stack_peek(stack);
					break;
				
				case "search":
					System.out.println("enter element");
					input=sc.nextInt();
					stack_search(stack,input);
					break;
					
				case "view":
					stack_view(stack);
					break;
					
				case "exit":
					i=1;
					break;
					
				//default:
					//System.out.println("invalid choice ");
					//i=1;
			}
			
		}
	}
	
	
}