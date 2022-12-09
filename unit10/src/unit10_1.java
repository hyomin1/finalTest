import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class prac10_1 extends JFrame {
	prac10_1() {
		super("마우스 올리기 내리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel la = new JLabel("Love Java");
		c.add(la);
		la.addMouseListener(new Mouse());
		setSize(300,150);
		setVisible(true);
	}
	class Mouse extends MouseAdapter {
		public void mouseEntered(MouseEvent e) {
			JLabel l = (JLabel)e.getSource();
			if(l.getText().equals("Love Java"))
				l.setText("사랑해");
		}
		public void mouseExited(MouseEvent e) {
			JLabel l =(JLabel)e.getSource();
			if(l.getText().equals("사랑해"))
				l.setText("Love Java");
		}
	}
}
public class unit10_1 {

	public static void main(String[] args) {
		new prac10_1();

	}

}
