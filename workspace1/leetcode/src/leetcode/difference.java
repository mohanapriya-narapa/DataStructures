package leetcode;

public class difference {

	public static void main(String[] args) {
		 int arr[] = new int[]{1, 5, 3, 19, 18, 25};
		 int n=arr.length;
		 System.out.println(mindifference(arr, n));

	}
	public static int mindifference(int arr[], int n){
		int diff=Integer.MAX_VALUE;
		 for (int i=0; i<n-1; i++)
	          for (int j=i+1; j<n; j++)
	           diff=Math.min(diff, Math.abs(arr[i]-arr[j]));
	       // Return min diff
	       return diff;
	    }
	  
	}


