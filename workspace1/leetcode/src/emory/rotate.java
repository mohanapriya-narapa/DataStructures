package emory;

public class rotate {

	public static void main(String[] args) {
int[] nums=new int[]{1,2,3,4,5,6,7};int k=3;int r=nums.length-k;
rotate(nums,r);
for(int i=0;i<nums.length;i++)System.out.println(nums[i]);
	}

	private static void rotate(int[] nums, int i) {
	swap(nums,0,6);
	swap(nums,0,i-1);
	swap(nums,i,nums.length-1);
	
		
	}

	private static void swap(int[] nums, int i, int j) {
		while(i<j){int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
		i++;
		j--;}
	}

}
