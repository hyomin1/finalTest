import javax.swing.*;
import java.awt.*;
class prac2 extends JFrame {
	prac2() {
		super("BorderLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout(5,7));
		c.add(new JButton("North"),BorderLayout.NORTH);
		c.add(new JButton("South"),BorderLayout.SOUTH);
		c.add(new JButton("Center"));
		c.add(new JButton("West"),BorderLayout.WEST);
		c.add(new JButton("East"),BorderLayout.EAST);
		setSize(400,200);
		setVisible(true);
		
	}
}
public class unit9_2 {

	public static void main(String[] args) {
		new prac2();

	}

}
