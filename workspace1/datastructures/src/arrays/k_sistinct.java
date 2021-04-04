package arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class k_sistinct {

	public static void main(String[] args) {
		int[] arr=new int[] {1, 2, 1, 3, 4, 2, 3};HashSet<Integer> hs=new HashSet<Integer>();
		ArrayList<Integer> al=new ArrayList<Integer>();
		int k=4;
		for(int i=0;i<arr.length-k+1;i++)
		{hs.clear();
			for(int j=i;j<k+i;j++)
			{
				hs.add(arr[j]);
				
			}al.add(hs.size());
		}System.out.println(al);
	}

}
