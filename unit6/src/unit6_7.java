import java.util.*;
public class unit6_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String s = sc.nextLine();
			if(s.equals("그만")) {
				System.out.print("종료합니다...");
				break;
			}
			String a[] = s.split(" ");
			System.out.println("어절 개수는 "+a.length);
			
		}
		

	}

}
