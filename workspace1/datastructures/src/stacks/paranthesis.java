package stacks;

import java.util.Stack;

public class paranthesis {

	public static void main(String[] args) {
		String str="()[]{}"; Stack<Integer> st=new Stack<Integer>();int count=0;
		
		
		Stack<Character> stack = new Stack<Character>();char[] c=str.toCharArray();
for(int i=0;i<str.charAt(i);i++)
{
	if((c[i]=='(')||(c[i]=='{')||(c[i]=='['))
	{
		stack.push(c[i]);
	}
	else if((c[i]==')')||(c[i]=='}')||(c[i]==']'))
	{
		stack.pop();
	}
}System.out.println(stack.empty());
	}

}
