import java.awt.*;
import javax.swing.*;
class North extends JPanel {
	North() {
		setBackground(Color.LIGHT_GRAY);
		add(new JButton("열기"));
		add(new JButton("닫기"));
		add(new JButton("나가기"));
	}
}
class South extends JPanel {
	South() {
		setBackground(Color.yellow);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JButton("Word Input"));
		add(new JTextField(16));
	}
}
class Center extends JPanel {
	Center() {
		setBackground(Color.white);
		setLayout(null);
		
		for(int i=0;i<10;i++) {
			JLabel j = new JLabel("*");
			int x = (int)(Math.random()*250+10);
			int y = (int)(Math.random()*200+10);
			j.setLocation(x,y);
			j.setSize(20,20);
			j.setForeground(Color.red);
			add(j);
		}
	}
}

class prac8 extends JFrame {
	prac8() {
		super("여러 개의 패널을 가진 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.add(new North(),BorderLayout.NORTH);
		c.add(new Center());
		c.add(new South(),BorderLayout.SOUTH);
		
		setSize(320,320);
		setVisible(true);
	}
}

public class unit9_8 {

	public static void main(String[] args) {
		new prac8();

	}

}
