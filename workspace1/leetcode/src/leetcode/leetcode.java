package leetcode;

public class leetcode {
	public static void main(String args[])
	{
		String word="jjjjjanbbjdgug";
		
		char[] c=word.toCharArray();
		int i=0;
		int j=word.length()-1;
		while(i<j)
		{
			char temp=c[j];
			c[j]=c[i];
			c[i]=temp;
			i++;
			j--;
			
		}
		System.out.println(c);
		
	}

	

}
