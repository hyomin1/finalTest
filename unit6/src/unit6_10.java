import java.util.*;
class Person {
	String name;
	Person(String name) {
		this.name=name;
	}
	boolean random() {
		int n[] = new int[3];
		for(int i=0;i<3;i++)
			n[i] = (int)(Math.random()*3+1);
		if((n[0]==n[1])&&(n[1]==n[2])) {
			System.out.println("       "+n[0]+"  "+n[1]+"  "+n[2]+"  "+name+"님이 이겼습니다!");
			return true;
		}
			
		else {
			System.out.println("       "+n[0]+"  "+n[1]+"  "+n[2]+"   아쉽군요!");
			return false;
		}
			
	}
}
public class unit6_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1번째 선수 이름>>");
		String name1 = sc.nextLine();
		Person p1 = new Person(name1);
		System.out.print("2번째 선수 이름>>");
		String name2 = sc.nextLine();
		Person p2 = new Person(name2);
		while(true) {
			System.out.print("["+p1.name+"]:<Enter>");
			sc.nextLine();
			if(p1.random())
				break;
			System.out.print("["+p2.name+"]:<Enter>");
			sc.nextLine();
			if(p2.random())
				break;
			
			
			
		}
		

	}

}
