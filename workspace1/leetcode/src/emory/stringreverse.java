package emory;

import java.util.Stack;

public class stringreverse {

	public static void main(String[] args) {
		String str="vanav";
		StringBuilder sb=new StringBuilder();
		
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<str.length();i++)
		{
			st.push(str.charAt(i));
		}
		for(int i=0;i<str.length();i++)
		{sb.append(st.pop());
		}String str2=sb.toString();
		if(str.equals(str2))
		{
			System.out.println("true");
		}
	}

}
