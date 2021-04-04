package geeks;

import java.util.HashSet;

public class diff {

	public static void main(String[] args) {
		HashSet<Integer> diff=new HashSet<Integer>();
		int[] a= new int[]  {1, 5, 3, 4, 2} ;int k=3;int count=0;
		for(int i=0;i<a.length;i++)
		{
			diff.add(a[i]);
		}for(int i=0;i<a.length;i++)
		{
			if((!diff.add(k+a[i]) ||(!diff.add(a[i]-k))))
			{
				count++;
			}
			
		}System.out.println(count/2 +"pairs");

	}

}
