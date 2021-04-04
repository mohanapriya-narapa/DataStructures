package geeks;

import java.util.HashSet;

public class soretdduplicates {

	public static void main(String[] args) {
	int[] arr=new int[] {1,1,2,4,4,5};int[] start=new int[arr.length];
	HashSet<Integer> hs=new HashSet<Integer>();
	for(int i=0;i<arr.length;i++)
	{
		if(!hs.add(arr[i]))
				{
			start[i]=arr[i];
		}
	}for(int i=0;i<start.length;i++){hs.remove(start[i]);}System.out.println(hs);
	}

}
