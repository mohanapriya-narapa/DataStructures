package emory;

public class subarray {

	public static void main(String[] args) {
		int[] arr=new int[] {-2,1,-3,4,-1,2,1,-5,4};int max=0;
		int sum1;
		for(int i=0;i<arr.length-1;i++)
		{sum1 =arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				sum1+=arr[j];
				max=Math.max(max, sum1);
			}
		}System.out.println(max);
	}

}
