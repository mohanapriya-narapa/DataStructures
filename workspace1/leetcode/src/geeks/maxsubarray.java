package geeks;
import java.util.Arrays;
public class maxsubarray {
public static void main(String[] args) {
int a[]=new int[] {6, -3, -10, 0, 2};
int b[]=new int[15];
int n=a.length;
int i; int j=0;int l=0;
for(i=0;i<n;i++)
{
    for(j=i;j<n;j++)
    {
        b[l]=factorial(a,i,j);
        l++;
    }
}
Arrays.sort(b);
System.out.print(b[l-1]);
}

private static int factorial(int[] a, int i, int n) 
{
    int k=0;
    int fac=1;
    for(k=i;k<=n;k++)
    {
        fac=fac*a[k];
    }
    return fac;
}
}