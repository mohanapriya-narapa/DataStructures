package javacode;

import java.util.Arrays;
public class hackerearth {

 static final int MAX_CHARS = 256;
 static String findSubString(String str)
 {
     int n = str.length();
   
     // Count all distinct characters.
     int dist_count = 0;
      
     boolean[] visited = new boolean[MAX_CHARS];
     Arrays.fill(visited, false);
     for (int i=0; i<n; i++)
     {
         if (visited[str.charAt(i)] == false)
         {
             visited[str.charAt(i)] = true;
             dist_count++;
         }
     }
   
     int start = 0, start_index = -1;
     int min_len = Integer.MAX_VALUE;
   
     int count = 0;
     int[] curr_count =  new int[MAX_CHARS];
     for (int j=0; j<n; j++)
     {
         // Count occurrence of characters of string
         curr_count[str.charAt(j)]++;
   
         if (curr_count[str.charAt(j)] == 1 )
             count++;
   
         // if all the characters are matched
         if (count == dist_count)
         {

             while (curr_count[str.charAt(start)] > 1)
             {
                 if (curr_count[str.charAt(start)] > 1)
                     curr_count[str.charAt(start)]--;
                 start++;
             }
              
             // Update window size
             int len_window = j - start + 1;
             if (min_len > len_window)
             {
                 min_len = len_window;
                 start_index = start;
             }
         }
     }

     return str.substring(start_index, start_index+min_len);
 }
   
 // Driver code
 public static void main(String args[])
 {
     String str = "aabcbcdbca";
     System.out.println("Smallest window containing all distinct"
            + " characters is " + findSubString(str).length());
 }
}



