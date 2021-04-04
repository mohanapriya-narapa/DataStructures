package emory;

public class maxcontinousone {

	public static void main(String[] args) {
	int[] arr=new int[]{1,2,1,1,1,4};
	int max=0;int count=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==1)
		{
			max=Math.max(max, ++count);
		}
		else{
			count=0;
		}
	}System.out.println(max);
	}

}
