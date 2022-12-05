import java.util.*;
public class unit7_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("미래장학금관리시스템입니다.");
		var h = new HashMap<String,Double>();
		for(int i=0;i<5;i++) {
			System.out.print("이름과 학점>> ");
			String name = sc.next();
			double score = sc.nextDouble();
			h.put(name, score);
		}
		System.out.print("장학생 선발 학점 기준 입력>> ");
		double score = sc.nextDouble();
		var keys = h.keySet();
		System.out.print("장학생 명단 : ");
		for(var name : keys) {
			if(h.get(name)>score)
				System.out.print(name+" ");
		}
	}

}
