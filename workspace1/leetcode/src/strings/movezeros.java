package strings;

import java.util.Arrays;

public class movezeros {

	public static void main(String[] args) {
int[] arr=new int[] {0,1,2,0,6,7};int j=0;int temp=0;
for(int i=0;i<arr.length;i++)
{
	if(arr[i]!=0)
	{
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;j++;
	}
}System.out.println(Arrays.toString(arr));
	}

}
