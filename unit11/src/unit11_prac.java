import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class prac11 extends JFrame {
	prac11() {
		super("JComponent의 공통 메소드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton b1 = new JButton("Magenta/Yellow Button");
		JButton b2 = new JButton(" Disabled Button ");
		JButton b3 = new JButton("getX(), getY()");
		c.add(b1);
		c.add(b2);
		c.add(b3);
		b1.setBackground(Color.YELLOW);
		b1.setForeground(Color.MAGENTA);
		b1.setFont(new Font("Arial",Font.ITALIC,20));
		b2.setEnabled(false);
		b3.addActionListener(new Button());
		setSize(260,200);
		setVisible(true);
		
	}
	class Button implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			prac11 frame = (prac11)b.getTopLevelAncestor();
			frame.setTitle(b.getX()+","+b.getY());
		}
	}

}
public class unit11_prac {

	public static void main(String[] args) {
		new prac11();

	}

}
