package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class frequency {

	public static void main(String[] args) {int count[] ={0,0,0,0,0,0,0};int max=0;
	HashMap<Integer,Integer> hs= new HashMap<Integer,Integer>();
	int arr[] =new int[] {1, 1, 2, 2, 2, 2, 3};
	for(int i=0;i<arr.length;i++)
	{
		count[arr[i]]++;hs.put(arr[i], count[arr[i]]); max=Math.max(max, count[arr[i]]);
	}System.out.println(hs);System.out.println(max);
	}

}
