package interview;

public class duplicates {
	 

	public static int countUnique(int[] A) 
	{ int count = 0; 
	for (int i = 0; i < A.length-1; i++)
	for(int j=1;j<A.length;j++)	
	{ if (A[i] == A[j]) 
	{ count++;
	
	}
	} return (A.length - count);
	}
	public static void main(String[] args) 
	{
		int[] arr = { 1,1, 1,1,2 }; 
		int size = countUnique(arr);
		System.out.println(size); }

	}


