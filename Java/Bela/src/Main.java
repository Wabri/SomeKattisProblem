import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numbers = "AKQJT987";
		int[] dominant = { 11, 4, 3, 20, 10, 14, 0, 0 };
		int[] notDominant = { 11, 4, 3, 2, 10, 0, 0, 0 };
		int numberOfHands = sc.nextInt();
		char trumpsSuit = sc.next().charAt(0);
		int taskPoints = 0;
		for (int i = 0; i < numberOfHands * 4; i++) {
			String card = sc.next();
			taskPoints += (card.charAt(1) == trumpsSuit) ? dominant[numbers.indexOf(card.charAt(0))]
					: notDominant[numbers.indexOf(card.charAt(0))];
		}
		System.out.println(taskPoints);
		sc.close();
	}

}
