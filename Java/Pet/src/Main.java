import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] result = { 0, 0, 0, 0, 0 };
		int max = 0;
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < 4; j++) {
				result[i] += sc.nextInt();
			}
			if (result[max] < result[i]) {
				max = i;
			}
		}
		System.out.println((max + 1) + " " + result[max]);
		sc.close();
	}

}
