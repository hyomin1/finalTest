import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class prac11 extends JFrame {
	prac11() {
		super("배경색 설정 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel la1 = new JLabel("Label: 디폴트 배경: 투명");
		la1.setBackground(Color.yellow);
		
		JLabel la2 = new JLabel("Label: setOpaque(true): 배경 불투명");
		la2.setOpaque(true);
		la2.setBackground(Color.yellow);
		
		JButton b1 = new JButton("Button: 디폴트 배경 : 불투명");
		b1.setBackground(Color.yellow);
		JButton b2 = new JButton("Button: setOpaque(false): 배경 투명");
		b2.setOpaque(false);
		b2.setBackground(Color.yellow);
		c.add(la1); c.add(la2); c.add(b1); c.add(b2);
		setSize(260,260);
		setVisible(true);
	
		
	}
	

}
public class unit11_prac {

	public static void main(String[] args) {
		new prac11();

	}

}
