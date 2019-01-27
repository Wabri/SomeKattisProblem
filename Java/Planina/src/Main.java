import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		The first square is made of 4 points, 
//		consider the number of points in a side = 2 
//		in the first iteration the number of points in one side will be 3 
//		(the 2 precedent points plus 1 new); 
//		the second iteration will be 5 3 points of the previous iteration 
//		plus the new medians between the 3 points ie 2; 
//		at the third iteration we will have 5 plus the median points ie 4... 
//		and so on. As it happens, the number of median points is equal to 
//		the number of points of the old iteration minus 1. We therefore find
//		that the total number of sides will be given by the number of points 
//		on one side multiplied by the number of points on the other side 
//		(which will have same value) then the final formula will be 
//		(number of points of the old iteration + the number of median points) ^ 2
		Scanner sc = new Scanner(System.in);
		int numberOfIterations = sc.nextInt();
		int numberOfPointsInOneLine = 2;
		for (int iteration = 1; iteration <= numberOfIterations; iteration++) {
			numberOfPointsInOneLine += numberOfPointsInOneLine - 1;
		}
		System.out.println(numberOfPointsInOneLine * numberOfPointsInOneLine);
		sc.close();
	}

}
