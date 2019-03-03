import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfDataSet = sc.nextInt();
		for (int i = 0; i < numberOfDataSet; i++) {
			sc.nextInt();
			int base = sc.nextInt();
			int input = sc.nextInt();
			int result = 0;
			List<Integer> inputToNewBase = new LinkedList<Integer>();
			while (input != 0) {
				inputToNewBase.add((input % base));
				input = input / base;
			}
			while (!inputToNewBase.isEmpty()) {
				Integer removed = inputToNewBase.remove(0);
				result += Math.pow(removed, 2);
			}
			System.out.println((i + 1) + " " + result);
		}
		sc.close();
	}

}
