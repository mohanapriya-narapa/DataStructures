package emory;

public class majority {

	public static void main(String[] args) {
	int[] arr=new int[]{1,1,2,1,1,1,4,2,1,4,1,1};int count=0,max=0;
	for(int i=0;i<arr.length-1;i++)
	{count=0;
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				count++;
				max=Math.max(max,count);
			}
		}if(max>arr.length/2)System.out.println(arr[i]);break;
	}
	}

}
