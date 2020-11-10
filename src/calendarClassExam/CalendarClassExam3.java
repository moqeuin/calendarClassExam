package calendarClassExam;

import java.util.Calendar;

public class CalendarClassExam3 {

	public static void main(String[] args) {
		final int[] TIME_UNIT = { 3600, 60, 1};
		final String[] TIME_UNIT_NAME = {"시간", "분", "초"};
		
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		cal1.set(Calendar.HOUR_OF_DAY, 10);
		cal1.set(Calendar.MINUTE, 20);
		cal1.set(Calendar.SECOND, 30);
		
		cal2.set(Calendar.HOUR_OF_DAY, 20);
		cal2.set(Calendar.MINUTE, 30);
		cal2.set(Calendar.SECOND, 10);
		
		// 두 날짜사이에 초 간격
		long differ = Math.abs((cal2.getTimeInMillis() - cal1.getTimeInMillis())/1000);
		
		System.out.println("두 날짜 사이에 초 간격은" + differ + "초입니다.");
		
		String tmp = "";
		for (int i = 0; i < TIME_UNIT.length; i++) {
			
			tmp += differ/TIME_UNIT[i] + TIME_UNIT_NAME[i];
			differ = differ%TIME_UNIT[i];

		}
		tmp += "입니다.";
		
		System.out.println(tmp);
	}

}
