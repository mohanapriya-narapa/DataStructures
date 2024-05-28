package Strings;
import java.util.*;
public class FrequencySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="ccaaabbbb";
System.out.println(frequencysort(str));
	}

	private static StringBuilder frequencysort(String str) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> hs= new HashMap<Character,Integer>();
		char[] ch=str.toCharArray();
		for(char c:ch)
		{
			hs.put(c, hs.getOrDefault(c,0)+1);
		}
		List<Character> li=new LinkedList<>(hs.keySet());
		Collections.sort(li, (a,b)->hs.get(b)- hs.get(a));
		StringBuilder sb= new StringBuilder();
		for(char c:li)
		{
			int copies= hs.get(c);
			for(int i=0;i<copies;i++)
			{
				sb.append(c);
			}
		}
		return sb;
	}

}
