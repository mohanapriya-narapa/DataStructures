package binary;

public class binary {
public static void main(String args[])
{
	System.out.println(binarysearch(new int[] {1,2,3,4,5,6},4));
}
public static int binarysearch(int a[], int x)
{
	int p=0;
	int r=a.length-1;
	while(p<=r)
	{
		int q=(p+r)/2;
		if(x<a[q])
			r=q-1;
		else if(x>a[q])
			p=q+1;
		else
			return q;
	}return -1;
}
}
