package recursion;



public class recursion {
public static void main(String args[])
{
	System.out.println(binarysearch(new int[] {1,2,3,4,5,6},0,5,3));
}
public static int binarysearch(int a[], int p, int r, int x)
{
	 p=0;
	 r=a.length-1;
	
	if(p>r)return -1;
	else{int q=(p+r)/2;
	if(a[q]==x)
		return q;
	else if(a[q]>x)
		return(binarysearch(a, p, q-1, x));
	else 
		return(binarysearch(a, q+1, r, x));
	}}
}