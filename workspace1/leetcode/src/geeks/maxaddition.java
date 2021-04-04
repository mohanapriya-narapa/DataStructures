package geeks;

public class maxaddition {

	public static void main(String[] args) {
		int A[]=new int[] {0,1,2,3,-2,1};
		 int max = Integer.MIN_VALUE, sum = 0;
		    for (int i = 0; i < A.length; i++) {
		        if (sum < 0) 
		            sum = A[i];
		        else 
		            sum += A[i];
		        if (sum > max)
		            max = sum;
		    }
System.out.println(max);
	}

}
