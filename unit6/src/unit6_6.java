import java.util.*;

public class unit6_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		System.out.print("황기태 시작 <Enter>키>>");
		String s1 = sc.nextLine();
		Calendar ca1 = Calendar.getInstance();
		int sec1 = ca1.get(Calendar.SECOND);
		System.out.println("  현재 초 시간 = "+sec1);
		System.out.print("10초 예상 후 <Enter>키>>");
		String s2 = sc.nextLine();
		Calendar ca2 = Calendar.getInstance();
		int sec2 = ca2.get(Calendar.SECOND);
		System.out.println("   현재 초 시간 = "+sec2);
		System.out.print("이재문 시작 <Enter>키>>");
		String s3 = sc.nextLine();
		Calendar ca3 = Calendar.getInstance();
		int sec3 = ca3.get(Calendar.SECOND);
		System.out.println("  현재 초 시간 = "+sec3);
		System.out.print("10초 예상 후 <Enter>키>>");
		String s4 = sc.nextLine();
		Calendar ca4 = Calendar.getInstance();
		int sec4 = ca4.get(Calendar.SECOND);
		System.out.println("  현재 초 시간 = "+sec4);
		int res1 = sec2-sec1;
		int res2 = sec4-sec3;
		if(res1<0)
			res1+=60;
		if(res2<0)
			res2+=60;
		String winner;
		if(res1>res2)
			winner="황기태";
		else
			winner="이재문";
		System.out.print("황기태의 결과 "+res1+", 이재문의 결과, "+res2+" 승자는 "+winner);
		

	}

}
