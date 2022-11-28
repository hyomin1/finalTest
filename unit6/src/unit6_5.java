import java.util.Calendar;

public class unit6_5 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		System.out.println("현재 시간은 "+hour+"시 "+minute+"분입니다.");
		if(hour>=4&&hour<=12)
			System.out.print("Good Morning");
		else if(hour>12&&hour<=6)
			System.out.print("Good Afternoon");
		else if(hour>6&&hour<=10)
			System.out.print("Good Evening");
		else
			System.out.print("Good Night");

	}

}
