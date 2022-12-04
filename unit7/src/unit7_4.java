import java.util.*;
public class unit7_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var v = new Vector<Integer>();
		
		while(true) {
			int sum = 0;
			System.out.print("강수량 입력 (0 입력시 종료)>> ");
			int rain = sc.nextInt();
			if(rain==0)
				break;
			v.add(rain);
			for(int i=0;i<v.size();i++) {
				System.out.print(v.get(i)+" ");
				sum+=v.get(i);
			}
			System.out.println();
			System.out.println("현재 평균 "+sum/v.size());
		}

	}

}
