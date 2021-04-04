package arrays;

public class arrays3 {

	public static void main(String[] args) {
	int[] nums=new int[] {1,12,-5,-6,50,3};int sum;int avg=Integer.MIN_VALUE;int div;
	int val=4;
	for(int i=0;i<nums.length-2;i++)
	{sum=0;div=Integer.MIN_VALUE;
		for(int j=i;j<val;j++)
		{
		sum+=nums[i];	
		
		}div=sum/val;avg=Math.max(div, avg);
	}System.out.println(avg);
	}

}
