package hashing;

import java.util.HashSet;

public class validanaagram {

	public static void main(String[] args) {
		String s="anagram";HashSet<Character> st=new HashSet<Character>();
String n="nagaram";boolean isit=false;
for(int i=0;i<s.length();i++)
{
	st.add(s.charAt(i));
}
for(int i=0;i<n.length();i++)
{
	if(st.contains(n.charAt(i)))
	{
		System.out.println("true");
	}break;
}
	}

}
