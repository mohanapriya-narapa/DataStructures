package arrays;

import java.util.Arrays;

public class array_reverse {

	public static void main(String[] args) {
	int arr[] =new int[] {1, 3, 5,6, 8};int start=0;int end=arr.length-1;
	while(start<end)
	{
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start=start+1;
		end=end-1;
	}System.out.println(Arrays.toString(arr));
	}

}
