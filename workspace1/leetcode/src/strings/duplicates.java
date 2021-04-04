package strings;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class duplicates {
	public static void main(String args[])
	{
String str="hdhddsdfafd";
char[] ch=str.toCharArray();
LinkedHashSet<Character> hs=new LinkedHashSet();
for(int i=0;i<str.length();i++)
{
	hs.add(str.charAt(i));
}
	System.out.println(hs);

}}
