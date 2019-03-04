import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String apaxianName = sc.next();
		String compactName = new String();
		compactName += apaxianName.charAt(0);
		for (int i = 1; i < apaxianName.length(); i++) {
			if (apaxianName.charAt(i) != compactName.charAt(compactName.length() - 1)) {
				compactName += apaxianName.charAt(i);
			}
		}
		System.out.println(compactName);
		sc.close();
	}

}
