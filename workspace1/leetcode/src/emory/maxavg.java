package emory;

public class maxavg {

	public static void main(String[] args) {
	int[] arr=new int[]{-2, -3, 4, -1, -2, 1, 5, -3};int s;int max=0;
	for(int i=0;i<arr.length;i++)
	{
		sum=0;
		for(int j=0;j<arr.length;j++)
		{
			for(int k=i;k<j;k++)sum+=arr[k];
			//max=Math.max(sum, max);	
		}//max=Math.max(sum, max);
	}max=Math.max(sum, max);System.out.println(max);
	}

}
