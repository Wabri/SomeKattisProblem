import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		for (int character = 0; character < word.length() - 1; character++) {
			if ((word.charAt(character) == 's') && (word.charAt(character + 1) == 's')) {
				System.out.println("hiss");
				sc.close();
				return;
			}
		}
		System.out.println("no hiss");
		sc.close();
	}

}
