import java.util.*;
public class unit6_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">>");
		String word = sc.nextLine();
		StringBuffer s = new StringBuffer(word);
		while(true) {
			System.out.print("명령: ");
			String order = sc.next();
			if(order.equals("그만")) {
				System.out.print("종료합니다");
				break;
			}
			String res[] = order.split("!");
			if(!word.contains(res[0]))
				System.out.println("찾을 수 없습니다!");
			else if(res[0]=="")
				System.out.println("잘못된 명령입니다!");
			else {
				word = word.replace(res[0], res[1]);
				System.out.println(word);
			}

			
		}

	}

}
