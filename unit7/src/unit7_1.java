import java.util.*;
public class unit7_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		System.out.print("정수(-1이 입력될때까지)>> ");
		while(true) {
			int n = sc.nextInt();
			if(n==-1)
				break;
			v.add(n);
		}
		int max = v.get(0);
		for(int i=0;i<v.size();i++) {
			if(max<v.get(i))
				max=v.get(i);
		}
		System.out.print("가장 큰 수는 "+max);

	}

}
