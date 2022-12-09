import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class prac10_4 extends JFrame {
	JLabel la = new JLabel("Love Java");
	prac10_4() {
		super("Left 키로 문자열 이동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(la);
		la.addKeyListener(new Key2());
		setSize(300,150);
		setVisible(true);
		la.setFocusable(true);
		la.requestFocus();
	}
	class Key2 extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode()== KeyEvent.VK_LEFT) {
				String s = la.getText();
				la.setText(s.substring(1)+s.substring(0,1));
			}
		}
	}
}
public class unit10_4 {

	public static void main(String[] args) {
		new prac10_4();

	}

}
