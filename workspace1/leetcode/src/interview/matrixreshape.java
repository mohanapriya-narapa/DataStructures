package interview;
import java.util.*;
public class matrixreshape {

	public static void main(String[] args) {
	int[][] nums=new int[][] {{1,2},{3,4}};int r=1;int c=4;
	Queue<Integer> queue=new LinkedList<Integer>();
    int[][] res = new int[r][c];
    for (int i = 0; i < nums.length; i++) {
        for (int j = 0; j < nums[0].length; j++) {
            queue.add(nums[i][j]);
        }
    }
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            res[i][j] = queue.remove();
        }
    }for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            System.out.println(Arrays.toString(res));
        }
    }
	}

}
