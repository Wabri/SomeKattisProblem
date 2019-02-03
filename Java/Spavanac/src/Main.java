import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hours = sc.nextInt();
		int minutes = sc.nextInt();
		minutes = minutes - 45;
		hours += (minutes < 0) ? -1 : 0;
		minutes = (minutes < 0) ? 60 + minutes : minutes;
		hours = (hours < 0) ? 24 + hours : hours;
		System.out.println(hours + " " + minutes);
		sc.close();
	}

}
