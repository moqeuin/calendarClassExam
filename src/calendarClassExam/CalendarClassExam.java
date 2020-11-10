package calendarClassExam;

import java.time.temporal.WeekFields;
import java.util.Calendar;

public class CalendarClassExam {

	public static void main(String[] args) {
		
		// Calendar 클래스는 추상클래스이므로 메서드를 이용해서 
		// 상속받은 GregorianCalendar 클래스를 반환한다.(그레고리력 따르지 않는 국가는 다른 클래스를 반환)
		// 현재의 시간을 가져온다.
		Calendar cal = Calendar.getInstance();  
		
		// 년 월 일
		System.out.println("올해의 연도" + cal.get(Calendar.YEAR));
		System.out.println("현재의 월" + (cal.get(Calendar.MONTH) + 1));
		System.out.println("현재의 일" + cal.get(Calendar.DATE));
		// 주
		System.out.println("올 해의 몇 째 주 " + cal.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 달의 몇 째 주 " + cal.get(Calendar.WEEK_OF_MONTH));
		// 일
		System.out.println("올 해의 몇 일 " + cal.get(Calendar.DAY_OF_YEAR));
		System.out.println("이 달의 몇 일 " + cal.get(Calendar.DAY_OF_MONTH));
		// 요일
		System.out.println("이 달의 몇 째 요일 " + cal.get(Calendar.DAY_OF_WEEK));
		
		// 오전 : 0, 오후 : 1
		System.out.println(cal.get(Calendar.AM_PM));
		// 시간(0 ~ 11)
		System.out.println(cal.get(Calendar.HOUR));
		// 시간(0 ~ 23)
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		// 분
		System.out.println(cal.get(Calendar.MINUTE));
		// 초
		System.out.println(cal.get(Calendar.SECOND));
		// 1000분의 1초(0 ~ 999)
		System.out.println(cal.get(Calendar.MILLISECOND));
		// timezone( -12 ~ 12)
		System.out.println((cal.get(Calendar.ZONE_OFFSET)/(60*60*1000)));
		// 달의 마지막 날 
		System.out.println(cal.getActualMaximum(Calendar.DATE));
	}

}
