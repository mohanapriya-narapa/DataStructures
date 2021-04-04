package interview;
import java.util.*;
import java.io.*;

public class stackpush {

	public static void main(String[] args) {
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		Stack<Character> stack = new Stack<Character>();

		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for (int i = 0; i < s.length(); i++) { 
			char curr = s.charAt(i);
if(map.keySet().contains(curr))
{
	stack.push(curr);
}
else if(map.values().contains(curr))
{
	if(!stack.empty() && map.get(stack.peek())==curr)
	{
		stack.pop();
	}
	
}
else
{
	System.out.println("no");
}
		}if(stack.empty())
		{
			System.out.println("yes");
		}
	}

}
