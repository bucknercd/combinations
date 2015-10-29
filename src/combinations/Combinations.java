package combinations;

import java.util.Scanner;

public class Combinations {

	public static void main(String[] args) {
		boolean go_state = true;
		String ans;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("==========Choice program==========\n");
		while (go_state == true) {
			System.out.println("Enter 'n' (up to 20)");
			long n = scan.nextLong();
			System.out.println("Enter 'r' (up to 20)");
			long r = scan.nextLong();
			long answer = C(n,r);
			System.out.println(n+" choose "+r+" is : "+answer);
			System.out.println("Would you like to continue?   Select 'y' to continue or 'n' to exit program:");
			ans = scan.next().toLowerCase();
			if (ans.contains("y")) {
				go_state = true;
			}else{
				go_state = false;
			}
		}
	}
	
	public static long fact(long n) {
		if (n == 1 || n == 0) {
			return 1;
		}
		else {
			return n * fact(n-1);
		}
	}
	
	public static long C(long n, long r) {
		long out = fact(n)/ (fact(r) * fact(n - r));
		return out;
	}
	
	public static long P(long n, long r) {
		long out = fact(n) / (fact(n) - fact(r));
		return out;
	}

}
