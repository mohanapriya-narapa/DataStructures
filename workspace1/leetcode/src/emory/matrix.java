package emory;

public class matrix {

	public static void main(String[] args) {
	int arr[][]=new int[][]{{1,2,3,4},{5,1,2,3},{9,5,1,2}};
	for(int i=0;i<arr.length-1;i++)
	{
	for(int j=0;j<arr[i].length-1;j++)
	{
		if(arr[i][j]!=arr[i+1][j+1])
		{
			System.out.println("false");
		}
	}
	}
	System.out.println("true");	
	
	}

}
