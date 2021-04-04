package arrays;

public class consequitive_ones {

	public static void main(String[] args) {
	int num[]=new int[] {1,1,0,1,1,1};int count=0;int result=0;
	for(int i=0;i<num.length;i++)
	{
		if(num[i]==1)
		{
			count++;
			result=Math.max(result, count);
		}
		else{
			count=0;
		}
	}System.out.println(result);

}}
