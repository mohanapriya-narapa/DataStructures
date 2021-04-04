package hackerrank;

import java.util.*;

public class stack1 {

	public static void main(String[] args) {
Stack<Integer> st=new Stack<Integer>();Stack<Integer> st2=new Stack<Integer>();
Scanner sc=new Scanner(System.in);int n=sc.nextInt();int a[]=new int[n];int[] k=new int[n];
ArrayList al=new ArrayList();
for(int i=0;i<n;i++)
{	a[i]=sc.nextInt();if(a[i]==1)
{
	 k[i]=sc.nextInt();

	st.push(k[i]);
}
else if(a[i]==2)
{
	st.pop();
}
else{
	for(int j=0;j<st.size();j++){
al.add(st.peek());}Collections.sort(al);
	System.out.println(al.get(al.size()-1));
}
}
}
}


