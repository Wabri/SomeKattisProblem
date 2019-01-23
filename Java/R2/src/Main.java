import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r1 = Integer.parseInt(sc.next());
		int S = Integer.parseInt(sc.next());
		System.out.println(S*2-r1);
		sc.close();
	}

}
