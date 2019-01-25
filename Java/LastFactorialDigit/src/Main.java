import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counter = sc.nextInt();
		while (counter > 0) {
			int result = sc.nextInt();
			for (int nextFactorial = result - 1; nextFactorial > 0; nextFactorial--) {
				result = (result * nextFactorial) % 10;
			}
			System.out.println(result);
			counter--;
		}
		sc.close();
	}

}
