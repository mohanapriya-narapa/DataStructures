package arrays;

import java.util.HashMap;

public class subarrayzero {

	public static void main(String[] args) {HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
	int[] arr=new int[] {15, -2, 2, -8, 1, 7, 10, 23};
	int maxlen=1000;int sum;
	for(int i=0;i<arr.length;i++)
	{ sum=0;
		for(int j=i;j<arr.length;j++)
		{
		sum+=arr[j];	
		if(sum==0)
		{
			maxlen=Math.min(maxlen,j-i+1);
			hs.put(i, j);
		}}
	}System.out.println(maxlen);
System.out.println(hs);
	}

}
