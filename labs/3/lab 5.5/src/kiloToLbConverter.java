import java.text.DecimalFormat;
public class kiloToLbConverter {
	public static void main (String[] args) {
		int i = 0;
		
		DecimalFormat df = new DecimalFormat("#.0");
		
		System.out.println("Kilograms  Pounds  |  Pounds  Kilograms");
		
		while (i < 200) {
			i++;
			double kilograms = i * 0.454;
			double pounds = i * 2.2;
			System.out.println(i+ "          " + df.format(pounds) + "    |   " + i + "      " + df.format(kilograms));
			
		}
	}
}
