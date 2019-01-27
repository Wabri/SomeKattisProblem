import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfMatch = sc.nextInt();
		int weight = sc.nextInt();
		int height = sc.nextInt();
		int diagonal = (int) Math.sqrt(Math.pow(weight, 2) + Math.pow(height, 2));
		for (int i = 0; i < numberOfMatch; i++) {
			int lenghtOfMatch = sc.nextInt();
			boolean canStayOn = (lenghtOfMatch <= diagonal) 
					|| (lenghtOfMatch <= weight) 
					|| (lenghtOfMatch <= height);
			System.out.println(canStayOn ? "DA" : "NE");
		}
		sc.close();
	}

}