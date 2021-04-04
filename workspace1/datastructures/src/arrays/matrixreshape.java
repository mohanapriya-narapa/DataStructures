package arrays;

import java.util.Arrays;

public class matrixreshape {

	public static void main(String[] args) {
	int nums[][] =new int[][] {{1,2},
	                            {3,4}};
	int r=1;int c=4;
	int m=nums.length;int n=nums[0].length;
	int[][] result=new int[r][c];
	int row=0;int col=0;
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
		result[row][col]=nums[i][j];
		col++;
		if(col==c)
		{
			col=0;
			row++;
		}
		}
	}
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)	System.out.println(result[i][j]);
	}


	}

}
