import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int whiteSpaces = 0;
		int lowercaseLetters = 0;
		int uppercaseLetters = 0;
		int symbols = 0;
		for (char character : input.toCharArray()) {
			int intCharacter = (int) character;
			if (intCharacter == 95) {
				whiteSpaces++;
			} else if (intCharacter > 96 && intCharacter < 123) {
				lowercaseLetters++;
			} else if (intCharacter > 64 && intCharacter < 91) {
				uppercaseLetters++;
			} else {
				symbols++;
			}
		}
		System.out.println((float) whiteSpaces / input.length());
		System.out.println((float) lowercaseLetters / input.length());
		System.out.println((float) uppercaseLetters / input.length());
		System.out.println((float) symbols / input.length());
		sc.close();
	}

}
