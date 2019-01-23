import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfPeriods = Integer.parseInt(sc.next());
		float qALYAccumulated = 0;
		for (int period = 0; period < numberOfPeriods; period++) {
			qALYAccumulated += Float.parseFloat(sc.next()) * Float.parseFloat(sc.next());
		}
		System.out.println(qALYAccumulated);
		sc.close();
	}

}
