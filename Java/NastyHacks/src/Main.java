import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfCases = sc.nextInt();
		for (int i = 0; i < numberOfCases; i++) {
			int noADS = sc.nextInt();
			int withADS = sc.nextInt() - sc.nextInt();
			System.out.println(
					(noADS > withADS) ? "do not advertise" : 
						((noADS < withADS) ? "advertise" : "does not matter"));
		}
		sc.close();
	}

}
