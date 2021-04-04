package arrays;

import java.util.Arrays;

public class rotate_array {

	public static void main(String[] args) {
	int[] num=new int[] {1,2,3,4,5,6,7};
	int k=3;
	reverse(num,0,num.length-k-1);
	reverse(num,num.length-k, num.length-1);
	reverse(num,0,num.length-1);
	System.out.println(Arrays.toString(num));

	}
public static void reverse(int[] nums, int i, int j)
{
	int tmp=0;
	while(i<j)
	{
		tmp=nums[i];
		nums[i]=nums[j];
		nums[j]=tmp;i++;
		j--;
	}
}
}
