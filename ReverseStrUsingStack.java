package practice;

/**
 * Java program to reverse String using Stack
 * @author Ravirajayya
 */
public class ReverseStrUsingStack 
{
	public static void main(String[] args) 
	{
		//create a new string
		StringBuffer tmpSB = new StringBuffer("Raviraj");
		
		//call reverse method
		String revreseString = reverse(tmpSB);
		
		// print the reversed String
		System.out.println(revreseString);
	}
	
	//function to reverse the string
	private static String reverse(StringBuffer tmpSB) 
	{
		// Create a stack of capacity equal to length of string
		int lengthStr = tmpSB.length();
		Stack stack = new Stack(lengthStr);
		
		//  Push all characters of string to stack
		for(int i = 0; i < lengthStr; i++)
			stack.push(tmpSB.charAt(i));
		
		// Pop all characters of string and put them back to str
		for(int i = 0; i < lengthStr; i++)
		{
			char ch = stack.pop();
			tmpSB.setCharAt(i, ch);
		}
		
		return tmpSB.toString();
	}
}

//stack
class Stack
{
	int size;
	int top;
	char[] c;
	
	Stack(int size)
	{
		this.size = size;
		top = -1;
		c = new char[size];
	}
	
	//function to pop element from stack
	public char pop() 
	{
		char retval = '\0';
		
		if(top < 0)
		{
			System.out.println("Stack underflow");
		}
		else
		{
			retval = c[top--];
		}
		
		return retval;
	}

	//function to push element in Stack
	boolean push(char ch)
	{
		boolean retVal = false;
		
		if(top > size)
		{
			System.out.println("Stack overflow");
			retVal = false;
		}
		else
		{
			c[++top] = ch;
		}
		
		return retVal;
	}
}
