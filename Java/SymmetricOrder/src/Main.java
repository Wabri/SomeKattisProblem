import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int set = 1;
		int dataSetDimension = sc.nextInt();
		while (dataSetDimension != 0) {
			List<String> input = new LinkedList<String>();
			List<String> result = new LinkedList<String>();
			for (int index = 0; index < dataSetDimension; index++) {
				input.add(sc.next());
			}
			result.add(input.get(0));
			if (dataSetDimension > 1) {
				result.add(input.get(1));
				for (int index = 2; index < dataSetDimension; index += 2) {
					int half = result.size() / 2;
					result.add(half, input.get(index));
					if (index + 1 < dataSetDimension) {
						result.add(half + 1, input.get(index + 1));
					}
				}
			}
			System.out.println("SET " + set);
			for (int index = 0; index < dataSetDimension; index++) {
				System.out.println(result.get(index));
			}
			dataSetDimension = sc.nextInt();
			set++;
		}
		sc.close();
	}

}
