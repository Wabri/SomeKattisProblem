import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sowCost = sc.nextDouble();
		int numberOfLawns = sc.nextInt();
		double totalCost = 0;
		while (numberOfLawns-- > 0) {
			totalCost += sc.nextDouble() * sc.nextDouble() * sowCost;
		}
		System.out.println(totalCost);
		sc.close();
	}

}
