import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int events = sc.nextInt();
		int[] days = new int[events];
		List<Integer> resultDays = new ArrayList<Integer>();
		while (events > 0) {
			int left = sc.nextInt();
			int right = sc.nextInt();
			for (int index = left; index <= right; index++) {
				if (!resultDays.contains(index)) {
					resultDays.add(index);
				}
			}
			events--;
		}
		System.out.println(resultDays.size());
		sc.close();
	}

}
