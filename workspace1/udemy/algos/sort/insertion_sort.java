package sort;

import java.util.Arrays;

public class insertion_sort {

	public static void main(String[] args) {
	int a[]=new int[] {25,47,33,19,8,18};
	for(int i=0;i<a.length;i++)
	{
		int element=a[i];
		int j=i-1;
		while(j>=0 && a[j]>element)
		{
			a[j+1]=a[j];
			j--;
		}a[j+1]=element;
	}System.out.println(Arrays.toString(a));
	}

}
