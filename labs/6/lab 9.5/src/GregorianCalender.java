import java.util.*;
public class GregorianCalender {
	public GregorianCalender(){
		Calendar calendar = new GregorianCalendar();
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH); 
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		
		calendar.setTimeInMillis(5000);
		
		System.out.println("Time:  " + calendar.getTime());
	}
}
