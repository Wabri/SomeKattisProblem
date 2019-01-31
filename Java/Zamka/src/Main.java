import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int d = sc.nextInt();
		int x = sc.nextInt();
		xFriends(l, d, x, true);
		xFriends(l, d, x, false);
		sc.close();
	}

	private static void xFriends(int l, int d, int x, boolean increasing) {
		for (int n = ((increasing) ? l : d); ((increasing) ? n <= d : n >= l); n += ((increasing) ? 1 : (-1))) {
			String nDigits = String.valueOf(n);
			int digitsSum = 0;
			for (int i = 0; i < nDigits.length(); i++) {
				digitsSum += Integer.parseInt(String.valueOf(nDigits.charAt(i)));
			}
			if (digitsSum == x) {
				System.out.println(n);
				break;
			}
		}
	}

}
