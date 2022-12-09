import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class prac10_5 extends JFrame {
	JLabel la = new JLabel("Love Java");
	prac10_5() {
		super("+,- 키로 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(la);
		la.setFont(new Font("Arial",Font.PLAIN,10));
		la.addKeyListener(new Key3());
		setSize(300,150);
		setVisible(true);
		la.setFocusable(true);
		la.requestFocus();
		
	}
	class Key3 extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			if(e.getKeyChar()=='+') {
				Font f = la.getFont();
				int size = f.getSize();
				la.setFont(new Font("Arial",Font.PLAIN,size+5));
			}
			else if(e.getKeyChar()=='-') {
				Font f = la.getFont();
				int size = f.getSize();
				la.setFont(new Font("Arial",Font.PLAIN,size-5));
			}
		}
	}
}
public class unit10_5 {

	public static void main(String[] args) {
		new prac10_5();

	}

}
