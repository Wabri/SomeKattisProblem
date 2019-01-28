import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int invertedFirstNumber = extractInvert(sc.next());
		int invertedSecondNumber = extractInvert(sc.next());
		System.out.println(invertedFirstNumber > invertedSecondNumber ? invertedFirstNumber : invertedSecondNumber);
		sc.close();
	}

	private static int extractInvert(String string) {
		return Integer.parseInt(String.valueOf(invertFirstWithThird(string.toCharArray())));
	}

	private static char[] invertFirstWithThird(char[] chars) {
		char temp = chars[0];
		chars[0] = chars[2];
		chars[2] = temp;
		return chars;
	}

}
