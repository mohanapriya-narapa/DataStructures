package arrays;

public class product {

	public static void main(String[] args) {
		int nums[]=new int[]{1,2,2,1,1,1};int k=3; 
		int sum=0;int count=0;
for(int i=0;i<nums.length-1;i++)
{ sum=nums[i];
	for(int j=i+1;j<nums.length;j++)
	{
		sum=sum+nums[j];if(sum==k)count++;
	}
}System.out.println(count);
	}

}
