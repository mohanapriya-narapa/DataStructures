package leetcode;

public class leader {

	public static void main(String[] args) {
	int arr[]=new int[] {16, 17, 4, 3, 5, 2};;
	int n=arr.length;
	printlead(arr, n);

	}
public static void printlead(int arr[], int x)
{
for(int i=0;i<x;i++)
{int j;
	for( j=i+1;j<x;j++)
	{
		if(arr[i]<=arr[j])
			break;
	}
	   if (j == x) // the loop didn't break
           System.out.print(arr[i] + " ");
   }
}
}

