package arrays;

public class thiird_max {

	public static void main(String[] args) {
	int[] arr=new int[] {1,3,5,4,7};int count=1,max=1;
	for(int i=0;i<arr.length-1;i++)
	{
		if((arr[i]<arr[i+1]))
		{
		count++;
		max=Math.max(max, count);
		}
		else{
			count=1;
		}
	}System.out.println(max);
	}

}
