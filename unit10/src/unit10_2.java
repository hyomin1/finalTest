import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class prac10_2 extends JFrame {
	prac10_2() {
		super("드래깅동안 YELLOW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.GREEN);
		c.addMouseListener(new Mouse2());
		c.addMouseMotionListener(new Mouse2());
		setSize(300,150);
		setVisible(true);
	}
	class Mouse2 extends MouseAdapter {
		public void mouseDragged(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.YELLOW);
		}
		public void mouseReleased(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.GREEN);
		}
	}
}
public class unit10_2 {

		public static void main(String[] args) {
			new prac10_2();

		}

	}

