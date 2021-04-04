package leetcode;

public class breakcontinue {
	public static void main(String[] args) {
	    for(int i=0;i<10;i++)
	    {
	        if (i==4)
	        {
	            break;
	        }
	        System.out.print(i+"\t");

	    }
	    System.out.println();
	    for(int i=0;i<10;i++)
	    {

	        if (i==4)
	        {
	            continue;
	        }
	        System.out.print(i+"\t");
	    }
	}

}
