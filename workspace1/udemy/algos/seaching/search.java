package seaching;

import java.util.Scanner;

public class search {
	
	public static void main(String[] args)
	{
		int[] a;
		a=new int[] {2,4,5,6,8};int y=5;
		
		System.out.println(procedure(a,5));
	}


	public static int procedure(int [] arr,int x)
	{for(int i=0;i<arr.length;i++)
	{	
		if(arr[i]==x)
		{
			return i;
		}
	}
		return -1;
	}
		
		
}
