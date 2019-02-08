import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String month = sc.next();
		int day = sc.nextInt();
		System.out.println(month.contentEquals("OCT") && (day == 31) ? "yup"
				: month.contentEquals("DEC") && (day == 25) ? "yup" : "nope");
		sc.close();
	}

}
