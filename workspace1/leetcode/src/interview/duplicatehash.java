package interview;

import java.util.HashMap;

public class duplicatehash {

	public static void main(String[] args) {
	int[] a=new int[] {1,2,3,2,4,3,5,6,7};
	int k=3;int min=Integer.MAX_VALUE;
	HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();
	for(int i=0;i<a.length;i++)
	{
		if(map.containsKey(a[i]))
		{
			int pre=map.get(a[i]);
			int gap=i-pre;
			min=Math.min(min, gap);			
		}
		map.put(a[i],i);
	}
	if(min <= k){ System.out.println(min); }else{ System.out.println("no"); }
	}

}
