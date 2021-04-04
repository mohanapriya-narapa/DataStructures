package leetcode;

import java.util.Scanner;

public class smallest {
public static void main(String args[])
{
	int t,n;
	Scanner sc=new Scanner(System.in);
	t=sc.nextInt();
	int[] a=new int[5];
	while(t-->0)
		{n=sc.nextInt();
		for(int i=0;i<n;i++)
		
	{
		a[i]=sc.nextInt();
	}
		for(int i=0;i<n-1;i++){
			if(a[i+1]<a[i])
			
		            System.out.print(a[i + 1] + " ");
		        else
		            System.out.print(-1 + " ");
			
		}
}
}
}