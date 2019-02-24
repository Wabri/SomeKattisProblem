import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int atBats = sc.nextInt();
		int walks = 0;
		int resultAtBats = 0;
		for (int i = 0; i < atBats; i++) {
			int input = sc.nextInt();
			if (input < 0) {
				walks++;
			} else {
				resultAtBats += input;
			}
		}
		System.out.println((double) resultAtBats / (atBats - walks));
		sc.close();
	}

}
