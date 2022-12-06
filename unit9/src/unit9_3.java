import javax.swing.*;
import java.awt.*;
class prac3 extends JFrame{
	prac3() {
		super("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout());
		JButton jb[] = new JButton[10];
		for(int i=0;i<10;i++) {
			jb[i] = new JButton(Integer.toString(i));
			c.add(jb[i]);
		}
		setSize(500,200);
		setVisible(true);
	}
}
public class unit9_3 {

	public static void main(String[] args) {
		new prac3();

	}

}
