package Strings;
import java.util.*;
public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs=new String[] {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> result=	anagramStrings(strs);
	System.out.println(result);
	}

	private static List<List<String>> anagramStrings(String[] strs) {
		// TODO Auto-generated method stub
		HashMap<String, List> hs=new HashMap<String,List>();
		for(String str:strs)
		{
			char[] charArray= str.toCharArray();
			Arrays.sort(charArray);
			String key=new String(charArray);
			if(!hs.containsKey(key))
			{
				hs.put(key, new ArrayList<>());
			}
			hs.get(key).add(str);
		}
		
		return new ArrayList<>(hs.values());
	}

}
