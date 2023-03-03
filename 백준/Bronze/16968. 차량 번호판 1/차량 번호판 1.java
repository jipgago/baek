import java.util.Scanner;

public class Main {
	final static int C = 26;
	final static int D = 10;
	static String numbering;
	static int num = 1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		numbering = sc.nextLine();
		
		String start = numbering.substring(0, 1);
		if(start.equals("c")) {
			num *= C;
		} else num *= D;
		
		for (int i = 0; i < numbering.length() - 1; i++) {
			String a = numbering.substring(i, i + 1);
			String b = numbering.substring(i + 1, i + 2);
			
			if (a.equals("d")) {
				if(a.equals(b)) num *= D - 1;
				else num *= C;
			}
			if (a.equals("c")) {
				if(a.equals(b)) num *= C - 1;
				else num *= D;
			}
		}
		System.out.println(num);
	}

}