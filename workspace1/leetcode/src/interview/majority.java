package interview;

public class majority {

	public static void main(String[] args) {
	int[] count=new int[6];
	for(int j=0;j<count.length;j++)
	{
		count[j]=0;
	}
	int a[]=new int[] {1,2,2,3,3,3,3};
for(int i=0;i<a.length;i++)
{
	count[a[i]]+=1;
}//System.out.println(count.toString());
for(int k=0;k<count.length;k++) {
	if(count[k]>3)System.out.print(k);
	}


}}
