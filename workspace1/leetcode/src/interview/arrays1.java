package interview;

public class arrays1 {

	public static void main(String[] args) {
int[] arr=new int[] {0,1,1,1,0,1,1,1,1};int count=0;boolean isit=false;int maxcount=0;
for(int i=0;i<arr.length;i++)
{
	if(arr[i]==1)
	{
		count++;isit=true;
	}maxcount=Math.max(count,maxcount);
	if((arr[i]==0)&& (isit==true) && count!=0 )
	{
		count=0;
	}
}System.out.println(maxcount);
	}

}
