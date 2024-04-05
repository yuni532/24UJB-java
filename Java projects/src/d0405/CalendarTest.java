package d0405;
import java.util.Calendar;
public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		System.out.print(year + "�� " );
		System.out.print(month + "�� " );
		System.out.print(day + "�� " );
		
		int ampm = now.get(Calendar.AM_PM);
		String strampm = null;
		
		if (ampm == Calendar.AM) {
			strampm = "����";
			
		}else {
			strampm = "����";
		}
		System.out.print(strampm + " " );
		
		int hour = now.get(Calendar.HOUR);
		int minute  = now.get(Calendar.MINUTE);
		int second  = now.get(Calendar.SECOND);
		
		System.out.print(hour + "�� " );
		System.out.print(minute + "�� " );
		System.out.print(second + "�� " );
	}

}
