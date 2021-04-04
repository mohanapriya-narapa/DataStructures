package leetcode;

public class capitals {
public static void main(String args[])
{
	String str="geeksforgeeks";
	toupper(str);
	
	
}
public static void toupper(String in)

{
	char[] chars = in.toCharArray();
	for (int i = 0; i < in.length(); i++)
       
            chars[i] = (char)((int)chars[i] - 'a' + 'A');
	System.out.println(chars);
}

}
