import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int abracadabraTimes = sc.nextInt();
		for (int i = 1; i <= abracadabraTimes; i++) {
			System.out.println(i + " Abracadabra");
		}
		sc.close();
	}

}
