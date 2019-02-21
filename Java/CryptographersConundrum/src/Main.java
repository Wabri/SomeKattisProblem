import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int result = 0;
		for (int i = 0; i < input.length(); i += 3) {
			if (input.charAt(i) != 'P') {
				result++;
			}
			if (input.charAt(i + 1) != 'E') {
				result++;
			}
			if (input.charAt(i + 2) != 'R') {
				result++;
			}
		}
		System.out.println(result);
		sc.close();
	}

}
