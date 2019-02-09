import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counter = sc.nextInt();
		while (counter <= Integer.MAX_VALUE) {
			String numberString = String.valueOf(counter);
			int sumDigit = Integer.parseInt(String.valueOf(numberString.charAt(0)));
			for (int index = 1; index < numberString.length(); index++) {
				sumDigit += Integer.parseInt(String.valueOf(numberString.charAt(index)));
			}
			if (counter % sumDigit == 0) {
				System.out.println(counter);
				break;
			}
			counter++;
		}
		sc.close();
	}

}
