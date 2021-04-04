package geeks;



import java.util.Arrays;

public class prodsubarray {

	public static void main(String[] args) {int ressult=0;
		int a[]=new int[] {6, -3, -10, 0, 2};
		int prod;int b[]=new int[25];
		for(int i=0;i<a.length-1;i++)
		{prod=1;
		for(int j=i;j<a.length;j++)
		{
		prod=prod*a[j];	
		b[j]=prod;i++;
		}
		}for(int k=0;k<b.length;k++)System.out.println(b[k]);
	}

}
