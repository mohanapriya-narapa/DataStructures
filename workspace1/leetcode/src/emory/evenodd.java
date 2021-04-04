package emory;

import java.util.Arrays;

public class evenodd {

	public static void main(String[] args) {
	int[] arr=new int []{12, 34, 45, 9, 8, 90, 3};
	int left=0,right=arr.length-1;
while(left<right)
{
	while((arr[left]%2==0))
	{
		left++;
	
	}
	while((arr[right]%2==1))
	{
		right--;
	}
	if(left<right)
	{
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;left++;right--;
	}
}System.out.println(Arrays.toString(arr));
	}

}
