import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfContenstant = Integer.parseInt(sc.next());
		int numberOfProblems = Integer.parseInt(sc.next());
		int counter = 0;
		while (counter < numberOfContenstant) {
			sc.next();
			counter++;
		}
		System.out.println(numberOfProblems);
		sc.close();
	}

}
