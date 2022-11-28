import java.util.*;
public class unit6_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String s = sc.nextLine();
			if(s.equals("그만"))
				break;
			StringTokenizer st = new StringTokenizer(s," ");
			System.out.println("어절 개수는 "+st.countTokens());
			
		}
		

	}

}
