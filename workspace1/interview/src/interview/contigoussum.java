package interview;

public class contigoussum {

	public static void main(String[] args) {
int[] arr=new int[]{-2, -3, 4, -1, -2, 1, 5, -3};
int max_sofar=0,max_now=0;
for(int i=0;i<arr.length;i++)
{
	max_now=max_now+arr[i];
	if(max_now<0)
		max_now=0;
	if(max_sofar<max_now)
		max_sofar=max_now;
}System.out.println(max_sofar);

	}

}
