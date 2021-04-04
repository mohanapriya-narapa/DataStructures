package strings;

public class matrix {

	public static void main(String[] args) {
		int[][] matrix=new int[][]{{1,0,1,1,1},{1,0,1,1,1}};
	boolean[] row=new boolean[matrix.length];
	boolean[] column=new boolean[matrix[0].length];
	for(int i=0;i<matrix.length;i++)
	{
		for(int j=0;j<matrix[0].length;j++)
		{
			if(matrix[i][j]==0)
			{
				row[i]=true;
				column[j]=true;
			}
		}
	}
	for(int i=0;i<row.length;i++)
	{
		if(row[i])
		{
			nulifyrow(matrix,i);
		}
	}
	for(int i=0;i<row.length;i++)
	{
		if(column[i])
		{
			nulifycoulmn(matrix,i);
		}
	}
	
		
	}

	private static void nulifycoulmn(int[][] matrix, int column) {
		for(int j=0;j<matrix[0].length;j++)
		{
			matrix[j][column]=0;
		}
		
	}

	private static void nulifyrow(int[][] matrix, int row) {
	for(int j=0;j<matrix[0].length;j++)
	{
		matrix[row][j]=0;
	}
		
	}

}
