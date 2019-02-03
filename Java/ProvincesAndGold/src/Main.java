import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] treasuresCost = { 6, 3, 0 };
		int[] victoryCardsCost = { 8, 5, 2 };
		int totalBuyingPower = 0;
		for (int i = 3; i > 0; i--) {
			totalBuyingPower += sc.nextInt() * i;
		}
		String bestVictoryCard = (totalBuyingPower >= victoryCardsCost[0]) ? "Province or "
				: ((totalBuyingPower >= victoryCardsCost[1]) ? "Duchy or "
						: ((totalBuyingPower >= victoryCardsCost[2]) ? "Estate or " : ""));
		String bestTreasuresCard = (totalBuyingPower >= treasuresCost[0]) ? "Gold"
				: ((totalBuyingPower >= treasuresCost[1]) ? "Silver"
						: ((totalBuyingPower >= treasuresCost[2]) ? "Copper" : ""));
		System.out.println(bestVictoryCard + bestTreasuresCard);
		sc.close();
	}

}
