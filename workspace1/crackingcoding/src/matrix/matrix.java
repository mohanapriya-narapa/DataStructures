package matrix;

public class matrix {

	public static void main(String[] args) {
		int[][] matrix=new int[][]{{15,20,40,85},{20,35,80,95},{30,55,95,105},{40,80,100,120}};
		int row=0;int x=35;
		int column=matrix[0].length-1;
		while(row<matrix[0].length &&column>0)
		{
			if(matrix[row][column]==x)
			{
				System.out.println(true);break;
			}
			else if(matrix[row][column]>x){
				column--;
			}
			else{
				row++;
			}
		}
	}

}
