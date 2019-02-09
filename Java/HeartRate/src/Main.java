import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfCases = sc.nextInt();
		while (numberOfCases-- > 0) {
			int beats = sc.nextInt();
			double seconds = sc.nextDouble();
			double aBPM = 60 / seconds;
			System.out.print(roundBPM((beats - 1) * aBPM));
			System.out.print(" " + roundBPM(beats * aBPM) + " ");
			System.out.println(roundBPM((beats + 1) * aBPM));
		}
		sc.close();
	}

	private static double roundBPM(double bPM) {
		return Math.floor(bPM * 10000) / 10000;
	}

}
