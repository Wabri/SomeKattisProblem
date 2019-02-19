import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		int min = sc.nextInt();
		if (max < min) {
			int temp = max;
			max = min;
			min = temp;
			for (int i = min + 1; i <= max + 1; i++) {
				System.out.println(i);
			}
		} else if (max == min) {
			System.out.println(max + 1);
		} else {
			for (int i = min + 1; i <= max + 1; i++) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
