package geeks;

import java.util.ArrayList;
import java.util.Collections;

public class maxproduct {

	public static void main(String[] args) {int A[] =new int[] {6, -3, -10, 0, 2};
		  int max = A[0], min = A[0], result = A[0];
		  for (int i = 1; i < A.length; i++) {
	            int temp = max;
	            max = Math.max(Math.max(max * A[i], min * A[i]), A[i]);
	            min = Math.min(Math.min(temp * A[i], min * A[i]), A[i]);
	            if (max > result) {
	                result = max;
	            }
	}System.out.println(result);
		  }

}
