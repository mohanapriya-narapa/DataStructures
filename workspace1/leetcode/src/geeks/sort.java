package geeks;

import java.util.*;
public class sort {
public static void main(String args[])
{
int a[] = {7, 1, 2, 3, 4, 5, 6};
Arrays.sort(a);
int i=0;int j=a.length-1;
while(i<j)
{
    System.out.print(a[j]+" ");
    System.out.print(a[i]+" ");
    i++;
    j--;
}
}
}