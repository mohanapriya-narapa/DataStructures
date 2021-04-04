package emory;

public class numsdisapp {

	public static void main(String[] args) {
		int[] arr=new int[] {1,2,4,6,7};
		for(int i=0;i<arr.length-1;i++)
		{
			if((arr[i+1]-arr[i])!=1)
			{
				System.out.println(arr[i]+1);
			}
				
		}
	}

}
