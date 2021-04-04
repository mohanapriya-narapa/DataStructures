
package strings;

import java.util.Arrays;

public class common {
	static final int MAX_CHAR = 99;
	public static void main(String[] args) {
	String str1="geeks";
	String str2="forgeeks";int[] a1 = new int[MAX_CHAR];
	for(int i=0;i<str1.length();i++)
	{
a1[str1.charAt(i)-'a']++;	
	}
for(int i=0;i<str2.length();i++)
	a1[str2.charAt(i)-'a']++;for(int i=0;i<99;i++)
	{
		if(a1[i]>1)
		{
			System.out.println((char)(i+'a'));
		}
	}
	}

}
