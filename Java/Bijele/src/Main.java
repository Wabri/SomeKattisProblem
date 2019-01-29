import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] outputSet = { 1, 1, 2, 2, 2, 8 };
		for (int i = 0; i < outputSet.length; i++) {
			outputSet[i] -= sc.nextInt();
			System.out.print(outputSet[i] + " ");
		}
		sc.close();
	}

}
