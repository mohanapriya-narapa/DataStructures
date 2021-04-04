import java.util.Arrays;

public class evenOddTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[]{1, 9, 5, 3, 2, 6, 7, 11};
		int left=0;int right=arr.length-1;
		while(left<right)
		{
			while(arr[left]%2==0)
			{
				left++;
			}
			while(arr[right]%2!=0)
			{
				right--;
			}
			
		}swap(left,right);
		System.out.println(Arrays.toString(arr));
		
	}

	private static void swap(int left, int right) {
		// TODO Auto-generated method stub
		int temp=left;
		left=right;
		right=temp;
	}

}
