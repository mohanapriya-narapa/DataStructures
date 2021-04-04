package interview;

public class ugly {

	public static void main(String[] args) {
	System.out.println(isUgly(24));//isUgly(24);
			
		}
	public static boolean isUgly(int num) { if(num==0) return false; if(num==1) return true;
	if(num%2==0){ num=num/2; return isUgly(num); }
	if(num%3==0){ num=num/3; return isUgly(num); }
	if(num%5==0){ num=num/5; return isUgly(num); }
	return false;
	}
	}


