package leetcode;

import java.util.Scanner;

public class chars {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0)
	{
		String s=sc.next();
		  int count[]=new int[26];
		  for(int i=0;i<s.length();i++)
		  {
			count[s.charAt(i)-'a']++; 
		  }
		  int max=0;char c='\0';
	
	for(int j=0;j<26;j++)
	{
		if(max<count[j])
		{
			 max=count[j];
             c=(char)('a'+j);
		}
	}System.out.println(c);
	}
	}
}
