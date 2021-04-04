
package hashing;
import java.io.*;
import java.util.*;
public class frequency {

	public static void main(String[] args) {
		String str="bhhtree";int[] counter = new int[26];
		TreeMap<Integer,Character> hs =new TreeMap<Integer,Character>();
	for(int i=0;i<str.length();i++)
	{
		++counter[str.charAt(i) - 'a'];	
		hs.put(counter[str.charAt(i) - 'a'],str.charAt(i));
	}Map<Integer,Character> treeMap = new TreeMap<Integer,Character>(hs);System.out.println(hs);
  
	}
	
}
