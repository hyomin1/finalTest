import java.util.*;

public class unit7_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var h = new HashMap<String,String>();
		h.put("그리스","아테네");
		h.put("독일","베를린");
		h.put("멕시코","멕시코시티");
		h.put("미국","워싱턴");
		h.put("중국","베이징");
		h.put("일본","도쿄");
		h.put("영국","런던");
		h.put("북한","평양");
		h.put("프랑스","파리");
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		while(true) {
			System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
			int n = sc.nextInt();
			if(n==1) {
				System.out.println("현재 "+h.size()+"개 나라와 수도가 입력되어 있습니다.");
				while(true) {
					System.out.print("나라와 수도 입력"+(h.size()+1)+">> ");
					String nation = sc.next();
					if(nation.equals("그만"))
						break;
					String capital = sc.next();
					String val = h.get(nation);
					if(val == null)
						h.put(nation, capital);
					else {
						System.out.println(nation+"는 이미 있습니다!");
					}
				}

			}
			else if(n==2) {
				var keys = h.keySet();
				for(var nation:keys) {
					System.out.print(nation+"의 수도는? ");
					String capital = sc.next();
					if(capital.equals("그만"))
						break;
					if(h.get(nation).equals(capital))
						System.out.println("정답!!");
					else
						System.out.println("아닙니다!!");
				}
				
			}
			else if(n==3) {
				System.out.println("게임을 종료합니다.");
				break;
			}
				
				
		}

	}

}
