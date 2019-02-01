import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputNumbers = sc.nextInt();
		int outputNumbers = 0;
		for (int i = 0; i<inputNumbers; i++) {
			int sumPow = sc.nextInt();
			int pow = sumPow%10;
			int sum = sumPow/10;
			outputNumbers += Math.pow(sum, pow);
		}
		System.out.println(outputNumbers);
		sc.close();
	}

}
