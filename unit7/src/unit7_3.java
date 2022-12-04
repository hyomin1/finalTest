import java.util.*;
public class unit7_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,Integer> nations = new HashMap<String,Integer>();
		System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");
		while(true) {
			System.out.print("나라 이름, 인구 >> ");
			String nation = sc.next();
			if(nation.equals("그만"))
				break;
			int person = sc.nextInt();
			nations.put(nation, person);
		}
		while(true) {
			System.out.print("인구 검색 >> ");
			String findPerson = sc.next();
			if(findPerson.equals("그만"))
				break;
			if(nations.containsKey(findPerson)) {
				int number = nations.get(findPerson);
				System.out.println(findPerson+"의 인구는 "+number);
			}
			else 
				System.out.println(findPerson+" 나라는 없습니다.");
				
	
		}
		
	}
}
