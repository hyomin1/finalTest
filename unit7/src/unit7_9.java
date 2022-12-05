import java.util.*;
interface IStack<T> {
	T pop();
	boolean push(T ob);
}
class MyStack<T> implements IStack<T> {
	int tos;
	Vector <T> v;
	MyStack() {
		tos=-1;
		v = new Vector<T>();
	}
	public T pop() {
		if(tos==-1)
			return null;
		else
			return v.get(tos--);
	}
	public boolean push(T ob) {
		if(tos+1>v.size()) 
			return false;
		else {
			tos++;
			v.add(ob);
			return true;
		}
	}
}
public class unit7_9 {

	public static void main(String[] args) {
		IStack<Integer> stack = new MyStack<Integer>();
		for(int i=0;i<10;i++)
			stack.push(i);
		while(true) {
			Integer n = stack.pop();
			if(n==null) break;
			System.out.print(n+" ");
		}

	}

}
