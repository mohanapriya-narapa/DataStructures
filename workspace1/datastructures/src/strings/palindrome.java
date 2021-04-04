package strings;

import java.util.Stack;

public class palindrome {

	public static void main(String[] args) {
		String str="vanav";  StringBuilder sb = new StringBuilder();String str1="";
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<str.length();i++)
		{
			st.push(str.charAt(i));
		}
for(int i=0;i<str.length();i++)
{ str1= str1+st.pop();
	}
	if(str.equals(str1))
	{
		System.out.println("yes");
	}
}

}
