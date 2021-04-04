package strings;

public class duplicate_counts {
	static final int NO_OF_CHARS = 256;
	public static void main(String[] args) {
String str="geeksforgeeks"; int count[] = new int[NO_OF_CHARS];
for(int i=0;i<str.length();i++)
{
	int j=(int)str.charAt(i);count[j-97]++;
}
for(int i=0;i<str.length();i++)
{
	if(count[i]!=0)
	{
		System.out.println((char)(i+97)+" "+count[i]);
	}
}

	}

}
