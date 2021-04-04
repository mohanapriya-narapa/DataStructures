package geeks;

import java.util.HashMap;

public class patternstring {

	public static void main(String[] args) {
		String pattern ="abba";boolean isit=true;
		String str = "dog cat cat dog";
		String[] words=str.split(" ");HashMap map = new HashMap ();
		if (words.length != pattern.length())
	        isit=false;
		 for (Integer i=0; i<words.length; ++i)
		 { if (map.put(pattern.charAt(i), i) != map.put(words[i], i))
		            {isit=false;}}
		   if(isit) System.out.println("true");

	}

}
