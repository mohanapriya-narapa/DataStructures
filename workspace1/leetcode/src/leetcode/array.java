package leetcode;

import java.util.Scanner;

public class array {
	public static void main(String args[])
	{
		
		Scanner s1=new Scanner(System.in);
		int t=s1.nextInt();
		  	
		int a[]=new int[10];
		int b[]=new int[10];
		
	
		while(t--!=0)
		{
		int n=s1.nextInt();
		for(int k=0;k<n;k++)
		{
			a[k]=s1.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		if(a[i]<0)
		{
			System.out.println(a[i]);
		}
		
		}
		for(int j=0;j<n;j++)
		{
			if(a[j]>=0)
			{
				System.out.println(a[j]);
			}
		}
		
		}
	}

}
