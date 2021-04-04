package emory;

import java.util.HashMap;

public class flip {

	public static void main(String[] args) {
	int[] num=new int[] {2, 7, 11, 15};int tar=9;
	HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
	int[] result=new int[2];
	for(int i=0;i<num.length;i++)
	{
		if(hs.containsKey(num[i]))
		{  int index=hs.get(num[i]);
			result[0]=index;
			result[1]=i;break;
		}else{
			hs.put(tar-num[i], i);
		}
	}System.out.println(result[0]);
	}

}
