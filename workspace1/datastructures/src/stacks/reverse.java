package stacks;

import java.util.Stack;

public class reverse {

	public static void main(String[] args) {
		Stack<Character>st=new Stack<Character>();
		String str="hddffgfdhs";
		char[]  c=str.toCharArray();

	
for(int i=0;i<str.length();i++){
	st.push(c[i]);
}
for(int i=0;i<str.length();i++){
	System.out.println(st.pop());
}

}
}
