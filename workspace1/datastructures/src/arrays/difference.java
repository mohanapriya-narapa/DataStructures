package arrays;

import java.util.HashMap;
import java.util.*;

public class difference {

	public static void main(String[] args) {
		int[] arr=new int[] {5, 20, 3, 2, 50, 80};
		int n=78;
		Map<Integer,Integer> hs=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(Math.abs(arr[i]-arr[j])==78)
				{
					hs.put(arr[i], arr[j]);
				}
			}
		}System.out.println(hs);
	}

}
