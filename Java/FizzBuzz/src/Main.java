import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println(
					(i % x == 0 && i % y == 0) ? "FizzBuzz" : (i % x == 0) ? "Fizz" : (i % y == 0) ? "Buzz" : i);
		}
		sc.close();
	}

}
