package strings;

import java.util.*;

public class even_substrings {

	public static void main(String[] args) {
	String str=" Geeks foxr Geeks";String str1 = null;LinkedHashSet hs1=new LinkedHashSet();
	HashSet hs=new HashSet();for(int i=0;i<str.length();i++){
		hs1.add(str.charAt(i));
	}
	for(int i=0;i<str.length();i++)
	{
	 if(!hs.add(str.charAt(i)))
	 {
		hs1.remove(str.charAt(i));
	 }
	}



System.out.println(hs1);
	}

}
