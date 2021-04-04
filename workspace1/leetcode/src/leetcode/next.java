package leetcode;

public class next {
	public static void main(String args[])
	{
		int[] arr=new int[] {4, 7 ,2, 8, 1};
		int n=arr.length;
		int next,i,j;
		for( i=0;i<n;i++)
			{next=-1;
			for( j=i+1;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					next=arr[j];
					break;
				}
			}System.out.println(arr[i]+"is "+next);
			}
			}

}
