package tenprobs;
import java.util.*;
public class rootwords {

	public static void main(String[] args) {
	String[] dict=new String[] {"cat", "bat", "rat"};
	String str="the cattle was rattled by the battery";
	String[] str2=str.split(" ");
	for(int i=0;i<str2.length;i++)
	{
		for(int j=0;j<dict.length;j++)
		{
			if(str2[i].contains(dict[j]))
			{
				str2[i]=dict[j];
			}
		}
	}System.out.println(Arrays.toString(str2));
	}

}
