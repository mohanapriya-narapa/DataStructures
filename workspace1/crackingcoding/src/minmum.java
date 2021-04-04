
public class minmum {

	public static void main(String[] args) {
int[] arr=new int[] {5, 6, 1, 2, 3, 4};int min=Integer.MAX_VALUE;
for(int i=0;i<arr.length;i++)
{
min=Math.min(arr[i], min);	
}
System.out.println(min);
	}

}
