

	package hackerrank;
	import java.io.*;
	import java.util.*;

	public class HourglassSum {

	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        ArrayList<ArrayList<Integer>> seq= new ArrayList<ArrayList<Integer>>();;
	       int no_seq=sc.nextInt();int lastAnswer=0;
	        int no_quer=sc.nextInt();
	        int seqtype, index, x, y;
	        for(int i=0;i<no_seq;i++)
	        {
	           int  type=sc.nextInt();
	            x=sc.nextInt();
	            y=sc.nextInt();
	            index=(x^lastAnswer)%no_seq;
	            if(type==1)
	            {
	                ArrayList<Integer> al=new ArrayList<Integer>();
	                al.add(y);
	                seq.get(index).add(y);
	            }
	            else
	            {
	                y = y % seq.get(index).size();
	                lastAnswer = seq.get(index).get(y);
	                   System.out.println(lastAnswer);
	            }
	        }
	    }
	}
