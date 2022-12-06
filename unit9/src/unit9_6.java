import java.awt.*;
import javax.swing.*;
class prac6 extends JFrame {
	prac6() {
		super("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		JLabel label[] = new JLabel[20];
		for(int i=0;i<label.length;i++) {
			label[i] = new JLabel("");
			int x = (int)(Math.random()*200)+50;
			int y = (int)(Math.random()*200)+50;
			label[i].setLocation(x,y);
			label[i].setSize(10,10);
			label[i].setOpaque(true);
			label[i].setBackground(Color.BLUE);
			c.add(label[i]);
		}
		setSize(300,300);
		setVisible(true);
	}
}
public class unit9_6 {

	public static void main(String[] args) {
		new prac6();

	}

}
