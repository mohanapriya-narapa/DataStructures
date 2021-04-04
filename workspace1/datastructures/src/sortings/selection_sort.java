package sortings;

import java.util.Arrays;

public class selection_sort {

	public static void main(String[] args) {
	int a[]=new int[] {9,8,3};
	for(int i=0;i<a.length;i++)
	{
		int min=i;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[j]<a[min])
			{
				min=j;
			}
		}
		int temp=a[i];
		a[i]=a[min];
		a[min]=temp;
		
	}for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	}

	
	

}
