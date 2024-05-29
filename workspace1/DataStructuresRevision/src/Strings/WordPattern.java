package Strings;

import java.util.*;

public class WordPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(wordPattern("abbc", "dog cat cat dog"));
	}

	private static boolean wordPattern(String order, String word) {
		// TODO Auto-generated method stub
		String[] words=word.split(" ");
		if(order.length()!=words.length)
		{
			return false;
		}
		char[] ch=order.toCharArray();
		HashMap<Character, String> hs=new HashMap<Character, String>();
		for(int i=0;i<words.length;i++)
		{
			
				if(hs.containsKey(ch[i]))
				{
					if(!hs.get(ch[i]).equals(words[i]))
					{
						return false;
					}
				}
				else
				{
					if(hs.containsValue(words[i]))
					{
						return false;
					}
					hs.put(ch[i],words[i]);
				}
			
		}
		return true;
	}

}
