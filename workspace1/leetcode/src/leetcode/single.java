package leetcode;

public class single {
	public static void main(String args[])
	{
		int a[]=new int[] {1,1,4,4,5};
		int result=a[0];
		for(int k=1;k<5;k++)
		{
		 result=result ^a[k];
		}
System.out.println(result);
	}

}
