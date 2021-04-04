package hashing;

import java.util.HashSet;
import java.util.Set;

public class happynum {

	public static void main(String[] args) {
		int n=19;
		 Set<Integer> inLoop = new HashSet<Integer>();
		    int squareSum,remain;
			while (inLoop.add(n)) {
				squareSum = 0;
				while (n > 0) {
				    remain = n%10;
					squareSum += remain*remain;
					n /= 10;
				}if (squareSum == 1)
					System.out.println("true");
				else
					n = squareSum;

			}
System.out.println("false");
	}

}
