package leetcode;

import java.util.Scanner;

public class cosequiive {

	public static void main(String[] args) {
int[] arr=new int[] {1,1,0,1,1,1};
int count=0;int max=0;
Scanner sc=new Scanner(System.in);

for(int i=0;i<5;i++)
{
	if(arr[i]==0)
	{	count=0;count++;
	 max=Math.max(max,count);}
	else
	{
		count++;
		 max=Math.max(max,count);
		}
}System.out.println(max);
	}

}
