package emory;

public class movezeros {
//int[] nums=new int[]{1,0,2,3,0,0,5};
	public static void main(String[] args) {
		int[] nums=new int[]{1,0,2,3,0,0,5};
		movezzeros(nums);
		for(int i=0;i<nums.length;i++)System.out.println(nums[i]);

	}

	private static void movezzeros(int[] nums) {
		for(int i=0,count=0;i<nums.length;i++)
		{
		if(nums[i]!=0)
		{if(count!=i)
			swap(nums,i,count);count++;
		}
		}
		
		
	}

	private static void swap(int[] nums, int i, int count) {
	int temp=nums[i];
	nums[i]=nums[count];
	nums[count]=temp;
	}

}
