package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        int n = in.nextInt();int m = in.nextInt();int a[]=new int[m];int b[]=new int[m];int k[]=new int[m];
        
        for(int i = 0; i < m; i++){
            a[i] = in.nextInt();
            b[i] = in.nextInt();
           k[i] = in.nextInt();
        }
       int[] arr=new int[n];
        Arrays.fill(arr,new Integer(0));
        for(int i=0;i<arr.length;i++)
            if((i+1>=a[i])&&(i+1<=b[i]))
                arr[i]=k[i];
         for(int i=0;i<arr.length;i++) System.out.println(arr[i]);
    }
}
