import java.util.Arrays;

public class evenodd {

	public static void main(String[] args) {
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
}swap(left,right);System.out.println(Arrays.toString(arr));
	}

	private static void swap(int left, int right) {
		int temp=left;
		 left=right;
		 right=temp;
		
	}

}
