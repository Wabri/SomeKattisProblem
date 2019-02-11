import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		String[] weekDays = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		Scanner sc = new Scanner(System.in);
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date day = new Date();
		try {
			day = dateFormat.parse(sc.nextInt() + "/" + sc.nextInt() + "/2009");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(weekDays[(day.getDay() + 6) % 7]);
		sc.close();
	}

}
