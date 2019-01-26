import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String autors = sc.next();
		if (Character.isUpperCase(autors.charAt(0))) {
			System.out.print(autors.charAt(0));
		}
		for (int character = 1; character < autors.length(); character++) {
			char element = autors.charAt(character);
			if (autors.charAt(character - 1) == '-') {
				System.out.print((Character.isUpperCase(element)) ? element : "");
			}
		}
		sc.close();
	}

}
