import java.awt.*;
import javax.swing.*;
class prac5 extends JFrame {
	prac5() {
		super("4x4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.setLayout(new GridLayout(4,4));
		JLabel j[] = new JLabel[16];
		Color [] color = { Color.RED, Color.ORANGE, Color.YELLOW, 
				Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY, 
				Color.PINK, Color.LIGHT_GRAY ,Color.WHITE,Color.DARK_GRAY,Color.BLACK,Color.yellow,
				Color.blue,Color.magenta}; 
		for(int i=0;i<j.length;i++) {
			j[i] = new JLabel(Integer.toString(i));
			j[i].setOpaque(true);
			j[i].setBackground(color[i]);
			c.add(j[i]);
		}
		setSize(500,200);
		setVisible(true);
	}
}
public class unit9_5 {

	public static void main(String[] args) {
		new prac5();

	}

}
