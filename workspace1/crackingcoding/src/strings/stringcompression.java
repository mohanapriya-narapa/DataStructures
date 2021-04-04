package strings;

public class stringcompression {

	public static void main(String[] args) {
		String str="aabbbccccddd";
		String compressed="";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			count++;
			if((i+1>=str.length() )||(str.charAt(i)!=str.charAt(i+1)))
			{
				compressed+=""+str.charAt(i)+count;
				count=0;
			}
		}
System.out.println(compressed);
	}

}
