package leetcode;

public class matrix {
public static void main(String args[])
{int i,j;
	int a[][]=new int[][]{ {1, 1, 1, 1},
            {2, 2, 2, 2},
            {3, 3, 3, 3},
            {4, 4, 4, 4}};
            int b[][]=new int[4][4];
            transpose(a, b);
            for (i = 0; i < 4; i++)
            {
                for (j = 0; j < 4; j++)
                   System.out.println( b[i][j]);
              //  System.out.println("\n");
            }
            
}
public static void transpose(int a[][],int b[][])
{
	int i, j;
    for (i = 0; i < 4; i++)
        for (j = 0; j < 4; j++)
            b[i][j] = a[j][i];
}

}
