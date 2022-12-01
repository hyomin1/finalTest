import java.util.*;
class Gamer {
	int size;
	String name[];
	Gamer(int size) {
		this.size=size;
		name = new String[size];
	}
	boolean randomNumber() {
		int random[] = new int[3];
		for(int i=0;i<random.length;i++)
			random[i] = (int)(Math.random()*3+1);
		if((random[0]==random[1])&&(random[1]==random[2])) {
			System.out.print("      "+random[0]+"  "+random[1]+"  "+random[2]+"  ");
			return true;
		}
		else {
			System.out.println("      "+random[0]+"  "+random[1]+"  "+random[2]+"  아쉽군요!");
			return false;
		}
			
		
		
	}
	void run(Scanner sc) {
		for(int i=0;i<size;i++) {
			System.out.print((i+1)+"번재 선수 이름>>");
			name[i] = sc.next();
		}
		while(true) {
			for(int i=0;i<size;i++) {
				System.out.print("["+name[i]+"]:<Enter>");
				sc.nextLine();
				if(randomNumber()) {
					System.out.print(name[i]+"님이 이겼습니다.");
					return;
				}
				
			}
		}
	}
}

public class unit6_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("갬블링 게임에 참여하 숫자>>");
		int n = sc.nextInt();
		Gamer g = new Gamer(n);
		g.run(sc);

	}

}
