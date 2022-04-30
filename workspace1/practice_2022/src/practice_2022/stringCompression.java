package practice_2022;

public class stringCompression {

	public static void main(String[] args) {
	String str="aabcccccaaa";
	int count=0;String compression="";
	for(int i=0;i<str.length();i++)
	{
		count++;
		if(i+1>=str.length() || str.charAt(i+1)!=str.charAt(i))
		{
			compression+= ""+str.charAt(i)+count;
			count=0;
		}
	}
	if(compression.length()>str.length())
	{
		System.out.println(str);
	}
	System.out.println(compression);
	}

}
