import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] inputPoints = new int[3][2];
		int[][] possiblePoints = new int[4][2];
		int xMax = 0;
		int xMin = Integer.MAX_VALUE;
		int yMax = 0;
		int yMin = Integer.MAX_VALUE;
		for (int i = 0; i < 3; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (x > xMax) {
				xMax = x;
			}
			if (y > yMax) {
				yMax = y;
			}
			if (x < xMin) {
				xMin = x;
			}
			if (y < yMin) {
				yMin = y;
			}
			inputPoints[i][0] = x;
			inputPoints[i][1] = y;
		}
		possiblePoints[0][0] = xMin;
		possiblePoints[0][1] = yMin;
		possiblePoints[1][0] = xMin;
		possiblePoints[1][1] = yMax;
		possiblePoints[2][0] = xMax;
		possiblePoints[2][1] = yMin;
		possiblePoints[3][0] = xMax;
		possiblePoints[3][1] = yMax;
		boolean[] isFound = { false, false, false, false };
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				if (inputPoints[j][0] == possiblePoints[i][0] && inputPoints[j][1] == possiblePoints[i][1]) {
					isFound[i] = true;
				}
			}
		}
		for (int i = 0; i < isFound.length; i++) {
			if (!isFound[i]) {
				System.out.println(possiblePoints[i][0] + " " + possiblePoints[i][1]);
				break;
			}
		}
		sc.close();
	}

}
