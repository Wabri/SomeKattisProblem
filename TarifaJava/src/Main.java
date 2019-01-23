import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long numberOfGigaPerMonth =sc.nextLong(), numberOfPrecedentMonths = sc.nextLong();
		long totalGigas = numberOfGigaPerMonth;
		for (int i=0; i<numberOfPrecedentMonths; i++) {
			totalGigas += numberOfGigaPerMonth - sc.nextLong();
		}
		System.out.println(totalGigas);
		sc.close();
	}

}
