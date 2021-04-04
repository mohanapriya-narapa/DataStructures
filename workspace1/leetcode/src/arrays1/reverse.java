package arrays1;

public class reverse {

	public static void main(String[] args) {
	String str="gsdh dfhk sdkads 2"; String[] str1=str.split(" ");
	int n=str1.length-1;
	int result = Integer.parseInt(str1[n]);

	for(int i=0;i<str1.length;i++)
	{if(i==(result-1))
	{for(int j=str1[result-1].length()-1;j>=0;j--)
	{
		System.out.print(str1[result-1].charAt(j));
	}
	System.out.print(" ");
	}
		if(i!=n && i!=(result-1))
		{
			System.out.print(str1[i]+" ");
		}
	}

	}

}
