import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfPairedStrings = sc.nextInt();
		for (int i = 0; i < numberOfPairedStrings; i++) {
			String[] strings = new String[2];
			strings[0] = sc.next();
			strings[1] = sc.next();
			String result = new String();
			for (int j = 0; j < strings[0].length(); j++) {
				if (strings[0].charAt(j) == strings[1].charAt(j)) {
					result += '.';
				} else {
					result += '*';
				}
			}
			System.out.println(strings[0]);
			System.out.println(strings[1]);
			System.out.println(result);
			System.out.println();
		}
		sc.close();
	}

}
