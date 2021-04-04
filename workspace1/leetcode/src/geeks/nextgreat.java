package geeks;

import java.util.Stack;

public class nextgreat {

	public static void main(String[] args) {
		 Stack<Integer> s = new Stack<Integer>();
		 int arr[] = new int[]{ 11, 13, 21, 3 };
		 s.push(arr[0]);  int element, next;
		 for(int i=0;i<arr.length;i++) 
		 { next = arr[i];
			 if (s.isEmpty() == false) 
	            {
	                element = s.pop();
	 
	                while (element < next) 
	                {
	                    System.out.println(element + " -- " + next);
	                    if (s.isEmpty() == true)
	                        break;
	                    element = s.pop();
	                }
	 
	                if (element > next)
	                    s.push(element);
	            }
			
	            s.push(next);
	        }
	 
	        while (s.isEmpty() == false) 
	        {
	            element = s.pop();
	            next = -1;
	            System.out.println(element + " -- " + next);
	        }
}}