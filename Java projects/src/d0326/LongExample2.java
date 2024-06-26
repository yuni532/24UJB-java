package d0326;

import java.util.Calendar;

public class LongExample2 {

	enum Week {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}; // 상수를 가르킬때 대문자로 씀

	public static void main(String[] args) {
		Week today = null;

		Calendar cal = Calendar.getInstance(); //getInstance, singleton pattern 싱글턴 패턴 
		int iweek = cal.get(Calendar.DAY_OF_WEEK);

		switch (iweek) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		System.out.println("오늘 요일 : " + today);

		if (today == Week.SUNDAY) {
			System.out.println("오늘은 쉬는 날 입니다.");
		} else {
			System.out.println("오늘은 공부하는 날 입니다.");
		}
	}

}
