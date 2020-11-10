package calendarClassExam;

import java.util.Calendar;

public class CalendarClassExam4 {

	public static void main(String[] args) {

		System.out.println("2019 9");
		
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;
		
		
		Calendar sCal = Calendar.getInstance();
		Calendar eCal = Calendar.getInstance();
		
		sCal.set(year, month - 1 , 1);
		eCal.set(year, month, 1);
		
		// 다음달의 첫 날에서 하루를 빼면 전 달의 마지막날을 구할 수 있다.
		eCal.add(Calendar.DATE, -1);
		
		// 달의 첫 번째 요일
		START_DAY_OF_WEEK = sCal.get(Calendar.DAY_OF_WEEK);
		// 달의 마지막 날
		END_DAY = eCal.get(Calendar.DATE);
		
		System.out.println("      " +  args[0] + "년  " + args[1] + "월");
		System.out.println(" SU MO TU WE TH FR SA");
		
		for (int i = 1; i < START_DAY_OF_WEEK; i++) {
			System.out.print("   "); // (공백)SU 3칸
		}
		
		for (int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
			System.out.print((i < 10)? "  "+i:" " + i); // 10보다크면 공백을 한 칸만
			if(n%7==0) System.out.println(""); // 토요일(7)이면 개행
		}		
	}
}