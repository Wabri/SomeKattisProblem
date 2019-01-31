import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfInput = sc.nextInt();
		for (int i = 0; i < numberOfInput; i++) {
			int input = sc.nextInt();
			System.out.println(input + ((input % 2 != 0) ? " is odd" : " is even"));
		}
		sc.close();
	}

}
