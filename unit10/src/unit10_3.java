import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class prac10_3 extends JFrame {
	JLabel la = new JLabel("Love Java");
	prac10_3() {
		super("Left 키로 문자열 교체");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(la);
		la.addKeyListener(new Key());
		setSize(300,150);
		setVisible(true);
		la.setFocusable(true);
		la.requestFocus();
		
	}
	class Key extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode() == KeyEvent.VK_LEFT) {
				StringBuffer s = new StringBuffer(la.getText());
				s = s.reverse();
				la.setText(s.toString());
			}
		}
	}
}
public class unit10_3 {

	public static void main(String[] args) {
		new prac10_3();

	}

}
