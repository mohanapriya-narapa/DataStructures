package Strings;


import java.util.*;

public class FirstLetterTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="abcdeda";
HashSet<Character> hs=new HashSet<Character>();
char[] ch=str.toCharArray();
for(char c:ch)
{
	if(hs.contains(c))
	{
		System.out.println(c);
		break;
	}
	hs.add(c);
}
	}

}
