import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class prac10_6 extends JFrame {
	JLabel la = new JLabel("C");
	prac10_6() {
		super("클릭 연습 용 응용프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		la.setLocation(100,100);
		la.setSize(20,20);
		c.add(la);
		setSize(300,300);
		setVisible(true);
		la.addMouseListener(new Mouse3());
		
	}
	class Mouse3 extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			la = (JLabel)e.getSource();
			int x = (int)(Math.random()*250);
			int y = (int)(Math.random()*250);
			la.setLocation(x,y);
		}
	}
}
public class unit10_6 {

	public static void main(String[] args) {
		new prac10_6();

	}

}
