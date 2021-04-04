package emory;

public class mindistance {

	public static void main(String[] args) {
String[] words=new String[]{"sjss", "hjhajh", "bnann", "mnnb"};
String word1="sjss";
String word2="mnnb";int dist=words.length;
for(int i=0;i<words.length;i++)
{if(words[i].equals(word1))
	for(int j=0;j<words.length;j++)
	{
	if(words[j].equals(word2))
	{
		dist=Math.min(dist,Math.abs(i-j));
	}
	}
}System.out.println(dist);
	}

}
