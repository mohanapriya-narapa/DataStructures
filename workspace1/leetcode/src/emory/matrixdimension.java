package emory;

import java.util.LinkedList;
import java.util.Queue;

public class matrixdimension {

	public static void main(String[] args) {
		int arr[][]=new int[][]{{1,2},{3,4}};
		int r=1;int c=4;int[][] res=new int[r][c];
		Queue < Integer > queue = new LinkedList< >();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                queue.add(arr[i][j]);
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = queue.remove();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
               System.out.print(res[i][j]);
            }
        }
	}

}
