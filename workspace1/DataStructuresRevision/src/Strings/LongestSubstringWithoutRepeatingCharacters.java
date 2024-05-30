package Strings;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcabcbb";
		System.out.println(lengthOfLongestSubstring(str));
	}
	private static int lengthOfLongestSubstring(String str) {
HashMap<Character,Integer> hs=new HashMap<Character,Integer>();
int n=str.length();
int ans=0;
for(int i=0,j=0;j<n;j++)
{
 if(hs.containsKey(str.charAt(j)))
 {
	 i=Math.max(hs.get(str.charAt(j))+1, i);
	 
 }
 ans=Math.max(j-i+1,ans);
 hs.put(str.charAt(j), j);
}
return ans;
	}
}
