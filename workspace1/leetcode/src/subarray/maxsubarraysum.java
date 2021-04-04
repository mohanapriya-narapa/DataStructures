package subarray;

public class maxsubarraysum {

	public static void main(String[] args) {
int[] arr=new int[] {-2,1,-3,4,-1,2,1,-5,4};int n=arr.length;int sum=0;int Maxsum=Integer.MIN_VALUE;
for(int i=0;i<n;i++)
{sum=arr[i];
	for(int j=i+1;j<n;j++)
	{
		sum+=arr[j];
		Maxsum=Math.max(sum, Maxsum);
		
	}
}System.out.println(Maxsum);
	}

}
