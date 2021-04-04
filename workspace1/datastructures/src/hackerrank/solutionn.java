package hackerrank;


	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class solutionn {

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int s = in.nextInt();
	        int t = in.nextInt();
	        int a = in.nextInt();
	        int b = in.nextInt();
	        int m = in.nextInt();
	        int n = in.nextInt();
	        int[] apple = new int[m];
	        for(int apple_i=0; apple_i < m; apple_i++){
	            apple[apple_i] = in.nextInt();
	        }
	        int[] orange = new int[n];
	        for(int orange_i=0; orange_i < n; orange_i++){
	            orange[orange_i] = in.nextInt();
	        }
	        for(int apple_i=0; apple_i < m; apple_i++){
	          if((apple[apple_i]+a<s) &&(apple[apple_i]>t ))System.out.println(apple[apple_i]);
	        }
	        for(int orange_i=0; orange_i < n; orange_i++){
	           if((orange[orange_i]+b <s) &&(orange[orange_i] >t ))System.out.println(orange[orange_i]);
	        }
	    }
	}

