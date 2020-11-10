package calendarClassExam;

import java.util.Calendar;

public class CalendarClassExam2 {

	public static void main(String[] args) {
		// 오늘과 특정 날짜 사이의 간격 구하기
		
		final String[] DAY_OF_WEEK = {"","일","월","화","수","목","금","토"};
		
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		cal1.set(2019, 3, 29); // 원하는 시간시점으로 설정
		System.out.println("cal1은 " + toString(cal1) 
		+ DAY_OF_WEEK[cal1.get(Calendar.DAY_OF_WEEK)] + "요일입니다.");
		System.out.println("cal1은 " + toString(cal2) 
		+ DAY_OF_WEEK[cal2.get(Calendar.DAY_OF_WEEK)] + "요일입니다.");
		
		// 두 날짜의 차이를 얻고자 한다면 천분의 일초 단위로 변환해야함
		// 초단위로 변환 후 저장
		long difference = 
				((cal2.getTimeInMillis() - cal1.getTimeInMillis())/1000);
		System.out.println("그 날(cal1)부터 지금(cal2)까지" + difference + "초가 지났습니다.");
		System.out.println("그 날(cal1)부터 지금(cal2)까지" + (difference/(60*60*24)) + "일이 지났습니다.");
		System.out.println("그 날(cal1)부터 지금(cal2)까지" + (difference/(60*60*24*12)) + "월이 지났습니다.");
	}
	
	public static String toString(Calendar cal) {
		
		return cal.get(Calendar.YEAR) + "년 " +
			   (cal.get(Calendar.MONTH)+1) + "월 " +
			   cal.get(Calendar.DATE) + "일 ";	
	}
	
	
	
	
}
