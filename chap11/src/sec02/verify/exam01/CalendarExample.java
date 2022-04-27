package sec02.verify.exam01;

import java.util.Calendar;

public class CalendarExample {
	
	public static void main(String[] args) {
	
	Calendar cal = Calendar.getInstance();
	
	int year = cal.get(Calendar.YEAR);
	int month = cal.get(Calendar.MONTH) + 1;
	String strMonth = (month < 10) ? ("0"+month) : ""+month;
	
	int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
	String strDayOfMonth = (dayOfMonth < 10) ? ("0"+dayOfMonth) : ""+month;
	
	String[] dayArray = {"일", "월", "화", "수", "목", "금", "토"};
	int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
	String strDayOfWeek = dayArray[dayOfWeek-1] + "요일";
	
	int hour = cal.get(Calendar.HOUR_OF_DAY);
	String strHour = (hour < 10) ? ("0"+hour) : (""+hour);
	
	int minute = cal.get(Calendar.MINUTE);
	String strMinute = (minute < 10) ? ("0"+minute) : (""+minute);
	
	System.out.println(year + "년 " + strMonth +"월 " + strDayOfMonth + "일 " + strDayOfWeek + " " + strHour + "시 " + strMinute + "분");
	}
}
