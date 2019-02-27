import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nTests = sc.nextInt();
		for (int i = 0; i < nTests; i++) {
			double velocity0 = sc.nextDouble();
			double angleTeta = (double) (sc.nextDouble() * Math.PI / 180);
			double x1 = sc.nextDouble();
			double h1 = sc.nextDouble();
			double h2 = sc.nextDouble();
			double t = (double) (x1 / (velocity0 * Math.cos(angleTeta)));
			double g = 9.81;
			double y1 = velocity0 * t * Math.sin(angleTeta) - g * Math.pow(t, 2) / 2;
			if (y1 + (double) 1 > h2 || y1 - (double) 1 < h1) {
				System.out.println("Not Safe");
			} else {
				System.out.println("Safe");
			}
		}
		sc.close();
	}

}
