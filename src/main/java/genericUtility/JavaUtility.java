package genericUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * This class is for all the java related utility
 */
public class JavaUtility {
	
	public int generateRandomNumber() {
		Random r = new Random();
		int number = r.nextInt(10000);
		return number;
	}
	
	public String calenderHandling() {
		Calendar cal = Calendar.getInstance();
		Date d = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		String date = sdf.format(d);
		return date;
		
	}

}
