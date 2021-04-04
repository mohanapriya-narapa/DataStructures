package interview;

public class isomorphic {

	public static void main(String[] args) {
	String s="egg";
	String t="add";boolean isit=false;
	int[] m1=new int[256];
	for(int i=0;i<256;i++)
		m1[i]=0;
	int[] m2=new int[256];
	for(int i=0;i<256;i++)
		m2[i]=0;
	for(int j=0;j<s.length();j++)
	{
		if(m1[s.charAt(j)]!=m2[t.charAt(j)])
		{
			isit=false;
		}
		m1[s.charAt(j)] = j + 1;
        m2[t.charAt(j)] = j + 1;
		}
	
isit=true;if(isit)System.out.println("true");
	}

}
