import java.util.*;
public class unit7_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
		var a = new ArrayList<Character>();
		double score[] = new double[6];
		for(int i =0;i<6;i++) {
			char c = sc.next().charAt(0);
			a.add(c);
		}
		double sum=0;
		for(int i =0;i<a.size();i++) {
			if(a.get(i).equals('A'))
				score[i] = 4.0;
			else if(a.get(i).equals('B'))
				score[i] = 3.0;
			else if(a.get(i).equals('C'))
				score[i] = 2.0;
			else if(a.get(i).equals('D'))
				score[i] = 1.0;
			else if(a.get(i).equals('F'))
				score[i] = 0;
			sum+=score[i];
		}
		System.out.print(sum/6);

	}

}
