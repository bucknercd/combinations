package combinations;

import java.util.Scanner;

public class Combinations {
	
	public static void main(String[] args) {
		boolean go_state = true;
		String line;
		String tokens [];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\n\n========== Choice / Permutations / Factorials program ==========\n");
		System.out.println("\tchoose or permute:   use this format < 'c' or 'p' >  < some int n >  < some int r >");
		System.out.println("\tfactorial:            use this fomat < some int >  < 'f' >");
		System.out.println("*** Enter 'q' to quit ***");
		while (go_state == true) {
			System.out.println("\nEnter desired operation: ");
			line = scan.nextLine().toLowerCase();
			tokens = line.split(" ");
			action(tokens);
		}
	} // end method main
	
	public static void action(String [] tokens) {
		int n,r;
		String operation;
		long answer;
		if (tokens.length == 3) {
			operation = tokens[0];
			n = Integer.parseInt(tokens[1]);
			r = Integer.parseInt(tokens[2]);
			if (operation.equals("c")) {
				answer = C(n,r);
				System.out.println(n+" choose "+r+" is : "+answer);
			}else if (operation.equals("p")) {
				answer = P(n,r);
				System.out.println(n+" permute "+r+" is : "+answer);
			}else{
				System.out.println("Invalid Format, try again...");
			}
		}else if (tokens.length == 2) {
			n = Integer.parseInt(tokens[0]);
			operation = tokens[1];
			answer = fact(n);
			System.out.println(tokens[0]+" factorial is "+answer);
		}else if (tokens.length == 1) {
			operation = tokens[0].toLowerCase();
			if (operation.equals("q")) {
				System.exit(1);
			}
		}
	}
	
	public static long fact(int n) {
		if (n == 0 || n == 1 ) {
			return 1;
		}else{
			return n * fact(n-1);
		}
	}
	
	public static long P(int n, int r) {
		return fact(n) / fact(n-r);
	}
	
	public static long C(int n, int r) {
		return fact(n) / ( fact(r) * fact(n-r) );
	}
} // end class Combinations



















