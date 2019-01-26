import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfStones = sc.nextInt();
		System.out.println((numberOfStones % 2 == 1) ? "Alice" : "Bob");
		sc.close();
	}

}
