package hashing;

import java.util.*;

public class tinyurl {

	public static void main(String[] args) {List<Integer> ll=new ArrayList<Integer>();
		int[] a=new int[] {5,5,5,1,1,1,2,2,3,4};TreeMap<Integer,Integer> hs=new TreeMap<Integer,Integer>();int[] count=new int[25];int[] b=new int[a.length];
	for(int i=0;i<a.length;i++)
	{
		
		hs.put(++count[a[i]], a[i]);
	}
System.out.println(hs);
for(Map.Entry<Integer, Integer> entry : hs.entrySet())
{
	int key=entry.getKey();if(key>=2){
	Integer value=entry.getValue();ll.add(value);
		}
	
}Integer names[]=ll.toArray(new Integer[ll.size()]);
for(int i=ll.size()-1;i>=0;i--)
{
	System.out.println(names[i]);
}
	}

}
