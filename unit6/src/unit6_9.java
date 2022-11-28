import java.util.*;
public class unit6_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String com[] = {"가위","바위","보"};
		
		while(true) {
			System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
			int n = sc.nextInt();
			int random = (int)(Math.random()*3+0);
			if(n==4)
				break;
			
			switch(n) {
			case 1:
				System.out.print("철수(가위) : 컴퓨터("+com[random]+")");
				if(random==0)
					System.out.println("비겼습니다");
				else if(random==1)
					System.out.println("컴퓨터가 이겼습니다.");
				else
					System.out.println("철수가 이겼습니다.");
				break;
			case 2:
				System.out.print("철수(바위) : 컴퓨터("+com[random]+")");
				if(random==0)
					System.out.println("철수가 이겼습니다.");
				else if(random==1)
					System.out.println("비겼습니다.");
				else
					System.out.println("컴퓨터가 이겼습니다.");
				break;
			case 3:
				System.out.print("철수(보) : 컴퓨터("+com[random]+")");
				if(random==0)
					System.out.println("컴퓨터가 이겼습니다.");
				else if(random==1)
					System.out.println("철수가 이겼습니다.");
				else
					System.out.println("비겼습니다.");
				break;
			
			
			}
			
			
		}
		
	}

}
