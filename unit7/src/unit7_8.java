import java.util.*;
public class unit7_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var h = new HashMap<String,Integer>();
		System.out.println("** 포인트 관리 프로그램입니다 **");
		while(true) {
			System.out.print("이름과 포인트 입력>> ");
			String name = sc.next();
			if(name.equals("그만"))
				break;
			int point = sc.nextInt();
			if(h.get(name)==null)
				h.put(name, point);
			else
				h.put(name, h.get(name)+point);
		
			var keys = h.keySet();
			for(var names : keys) {
				System.out.print("("+names+","+h.get(names)+")");
			}
			System.out.println();
		}

	}

}
