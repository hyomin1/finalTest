import java.awt.*;
import javax.swing.*;
class NorthPanel extends JPanel {
	NorthPanel() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setBackground(Color.gray);
		add(new JLabel("수식입력"));
		add(new JTextField(15));
	}
}
class SouthPanel extends JPanel {
	SouthPanel() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setBackground(Color.yellow);
		add(new JLabel("계산 결과"));
		add(new JTextField(15));
		
	}
}
class CenterPanel extends JPanel {
	CenterPanel() {
		setLayout(new GridLayout(4,4,2,2));
		JButton btn[] = new JButton[10];
		JButton b[] = {new JButton("+"),new JButton("-"),new JButton("x"),new JButton("/")};
		for(int i=0;i<10;i++) {
			btn[i] = new JButton(Integer.toString(i));
			add(btn[i]);
		}
		add(new JButton("CE"));
		add(new JButton("계산"));
		for(int i=0;i<4;i++)  {
			b[i].setBackground(Color.CYAN);
			add(b[i]);
		}
		
	}
}
class prac7 extends JFrame {
	prac7() {
		super("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.add(new NorthPanel(),BorderLayout.NORTH);
		c.add(new CenterPanel());
		c.add(new SouthPanel(),BorderLayout.SOUTH);
		setSize(300,250);
		setVisible(true);
		
	}
}
public class unit9_7 {

	public static void main(String[] args) {
		new prac7();

	}

}
