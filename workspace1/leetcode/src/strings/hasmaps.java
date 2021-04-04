package strings;

import java.util.*;
public class hasmaps {
public static void main(String args[])
{
    int x[]= {2,3};
    String a[]=new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    HashMap<Integer, String> map= new HashMap<Integer, String>();
    for(int i=0;i<2;i++)
    {
        map.put(x[i], a[x[i]]);
    }
    char str1[]=map.get(x[0]).toCharArray();
    char str2[]= map.get(x[1]).toCharArray();
    for(int j=0;j<str1.length;j++)
    {
        for(int k=0;k<str2.length;k++)
        {
            System.out.print(str1[j]);
            System.out.println(str2[k]);
        }
    }
}
}