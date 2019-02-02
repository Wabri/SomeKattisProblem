import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cupsSwap = sc.next();
		int ball = 0;
		for (int i = 0; i < cupsSwap.length(); i++) {
			if ((cupsSwap.charAt(i) == 'A') && (ball != 2)) {
				ball = (ball == 0) ? 1 : 0;
			} else if ((cupsSwap.charAt(i) == 'B') && (ball != 0)) {
				ball = (ball == 1) ? 2 : 1;
			} else if ((cupsSwap.charAt(i) == 'C') && (ball != 1)) {
				ball = (ball == 2) ? 0 : 2;
			}
		}
		System.out.println(ball + 1);
		sc.close();
	}

}
