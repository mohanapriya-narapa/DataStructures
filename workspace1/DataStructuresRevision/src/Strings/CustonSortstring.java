package Strings;

import java.util.*;

public class CustonSortstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(customSortString( "cba",  "abcd"));
	}

	private static String customSortString(String s, String t) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> hs=new HashMap<>();
		for(int i=0;i<t.length();i++)
		{
			hs.put(t.charAt(i), hs.getOrDefault(t.charAt(i),0)+1);
		}
		StringBuilder sb=new StringBuilder();
		for(char ch:s.toCharArray())
		{
			if(hs.containsKey(ch))
			{
				int c= hs.remove(ch);
				for(int i=0;i<c;i++)
				{
					sb.append(ch);
				}
				
			}
		}
		for(char ch:hs.keySet())
		{
			 int count=hs.get(ch);
		        for(int i=0;i<count;i++)
		        {
		            sb.append(ch);
		        }
		}
		
		return sb.toString();
	}

}
