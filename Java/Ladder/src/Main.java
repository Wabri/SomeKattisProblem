import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int high = sc.nextInt();
		double result = high / (Math.sin(sc.nextInt() * Math.PI / 180));
		System.out.println((int) result + 1);
		sc.close();
	}

}
