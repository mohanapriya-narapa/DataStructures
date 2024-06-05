package slidingWindow;

public class MinSubArrayLen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[] {2,3,1,2,4,3};
System.out.println(minSubArrayLen(nums));
	}

	private static int minSubArrayLen(int[] nums) {
		// TODO Auto-generated method stub
		int start=0;
		int end=0;
		int sum=0;
		int minLen=Integer.MAX_VALUE;
		int target=7;
		while(end<nums.length)
		{
			sum+=nums[end];
			while(sum>=target)
			{
				int len=end-start+1;
				minLen=Math.min(minLen, len);
				sum-=nums[start++];
				
				}end++;
		}
		return minLen;
	}

}
