import java.util.Calendar;
import java.util.GregorianCalendar;

// JA: Always add comments to your code
public class GregorianTest {
	public static void main(String[] args) {
		GregorianCalendar calendar = new GregorianCalendar();
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH); 
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("Current time is: " + calendar.getTime());

		calendar.setTimeInMillis(5000); // JA: This was supposed to be 1234567898765L

		System.out.println("After setting Time: " + calendar.getTime());
		
		System.out.println("Current year: " + year);
		   
		System.out.println("Current month: " + month);
		  
		System.out.println("Current day of month: " + dayOfMonth);
	}
	
}
