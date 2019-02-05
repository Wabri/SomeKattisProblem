import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int daysOfLisence = sc.nextInt();
		int minChunks = sc.nextInt();
		int day = 0;
		for (int i = 1; i < daysOfLisence; i++) {
			int iChunks = sc.nextInt();
			if (minChunks > iChunks) {
				minChunks = iChunks;
				day = i;
			}
		}
		System.out.println(day);
		sc.close();
	}

}
