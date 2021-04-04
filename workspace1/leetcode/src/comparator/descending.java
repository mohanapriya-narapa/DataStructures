package comparator;

import java.util.*;

public class descending {

	public static void main(String[] args) {
		ArrayList<Character> al=new ArrayList<Character>();
		al.add('A');
		al.add('B');
		al.add('C');
		al.add('D');
		al.add('E');
		 Comparator comparator = Collections.reverseOrder();
		 Collections.sort(al,comparator);
		 System.out.println(al);
		
	}

}
