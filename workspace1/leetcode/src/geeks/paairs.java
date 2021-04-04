package geeks;

import java.util.*;
public class paairs {
public static void main(String args[])
{
    int arr[] = {9,3, 7, 8, 6, 2, 1};
    Arrays.sort(arr);
    int n=arr.length;
        if(arr.length==n)
        {
            int mid=arr.length/2;
            for(int i=n-1;i>=0;i--)
            {
                System.out.print(arr[i-mid]+" ");
                System.out.print(arr[i]+" ");
            }
        }
    
}
}

