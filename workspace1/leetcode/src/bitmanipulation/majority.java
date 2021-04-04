package bitmanipulation;

import java.util.Arrays;

public class majority {

	public static void main(String[] args) {
	int a[] =new int[] {1,2,2,6,6,5};int n=a.length;
	int count[]=new int[37];
	for(int i=0;i<a.length;i++)
	{
		count[a[i]]++;
	}System.out.println(Arrays.toString(count));
	for(int i=0;i<count.length;i++)
	{if(count[i]>=(2))
	{
	System.out.print(i+" ");	
	}
	}
	}

}
