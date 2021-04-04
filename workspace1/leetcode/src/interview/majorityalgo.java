package interview;

public class majorityalgo {

	public static void main(String[] args) {
	int result=0;
	int count=0;
	int[] num=new int[] {1,2,3,2,2,3};
	for(int i=0;i<num.length;i++)
	{
	if(count==0)
	{
		result=num[i];
		count=1;
	}
	else if(result==num[i])
	{
		count++;
	}
	else{
		count--;
	}
	}System.out.println(result);

	}

}
