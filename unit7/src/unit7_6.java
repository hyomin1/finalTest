import java.util.*;
class Location {
	int x,y;
	Location(int x, int y) {
		this.x=x;
		this.y=y;
	}
	int getX() {
		return x;
	}
	int getY() {
		return y;
	}
}
public class unit7_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("도시,경도,위도를 입력하세요.");
		var h = new HashMap<String,Location>();
		Location l[] = new Location[4];
		for(int i=0;i<4;i++) {
			System.out.print(">> ");
			String inform = sc.nextLine();
			String s[] = inform.split(",");
			String city = s[0].trim();
			int x = Integer.parseInt(s[1].trim());
			int y = Integer.parseInt(s[2].trim());
			l[i] = new Location(x,y);
			h.put(city, l[i]);
		}
		var keys = h.keySet();
		System.out.println("--------------------------------");
		for(var city : keys) {
			System.out.println(city+"  "+h.get(city).getX()+"  "+h.get(city).getY());
		}
		System.out.println("--------------------------------");
		while(true) {
			System.out.print("도시 이름 >> ");
			String city = sc.next();
			if(city.equals("그만"))
				break;
			var value = h.get(city);
			if(value == null)
				System.out.println(city+"는 없습니다.");
			else 
				System.out.println(city+"  "+h.get(city).getX()+"  "+h.get(city).getY());
		}
	}

}
