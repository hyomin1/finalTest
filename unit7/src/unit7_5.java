import java.util.*;
class Student {
	String name,subject;
	int sid;
	double avg;
	Student(String name,String subject,int sid, double avg) {
		this.name=name;
		this.subject=subject;
		this.sid=sid;
		this.avg=avg;
	}
	String getName() {
		return name;
	}
	String getSubject() {
		return subject;
	}
	int getSid() {
		return sid;
	}
	double getAvg() {
		return avg;
	}
	
	
}
public class unit7_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var a = new ArrayList<Student>();
		Student s[] = new Student[4];
		System.out.println("학생 이름,학과,학번,학점평균 입력하세요.");
		for(int i=0;i<4;i++) {
			System.out.print(">> ");
			String inform = sc.nextLine();
			String in[] = inform.split(",");
			String name = in[0].trim();
			String subject = in[1].trim();
			int sid = Integer.parseInt(in[2].trim());
			double avg = Double.parseDouble(in[3].trim());
			s[i] = new Student(name,subject,sid,avg);
			a.add(s[i]);
		}
		System.out.println("-------------------------");
		for(int i =0;i<a.size();i++) {
			Student si = a.get(i);
			System.out.println("이름:"+si.getName());
			System.out.println("학과:"+si.getSubject());
			System.out.println("학번:"+si.getSid());
			System.out.println("학점평균:"+si.getAvg());
			System.out.println("-------------------------");
		}
		while(true) {
			System.out.print("학생 이름>> ");
			String name = sc.next();
			if(name.equals("그만"))
				break;
			for(int i=0;i<a.size();i++) {
				if(name.equals(a.get(i).getName()))
					System.out.println(a.get(i).getName()+", "+a.get(i).getSubject()+", "+a.get(i).getSid()+", "
							+a.get(i).getAvg());
					
			}
		}
		
	}

}
