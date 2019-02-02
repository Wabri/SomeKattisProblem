import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stages = sc.nextInt();
		while (stages != -1) {
			int totalDistanceDriven = 0;
			int precedentStep = 0;
			for (int i = 0; i < stages; i++) {
				int speedMiles = sc.nextInt();
				int totalElapsedTime = sc.nextInt();
				totalDistanceDriven += (totalElapsedTime - precedentStep) * speedMiles;
				precedentStep = totalElapsedTime;
			}
			System.out.println(totalDistanceDriven + " miles");
			stages = sc.nextInt();
		}
		sc.close();
	}

}
