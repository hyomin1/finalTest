import java.awt.*;
import javax.swing.*;
class prac4 extends JFrame {
	prac4() {
		super("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout());
		JButton jb[] = new JButton[10];
		Color [] color = { Color.RED, Color.ORANGE, Color.YELLOW, 
				Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY, 
				Color.PINK, Color.LIGHT_GRAY }; 
		for(int i=0;i<10;i++) {
			jb[i] = new JButton(Integer.toString(i));
			jb[i].setOpaque(true);
			jb[i].setBackground(color[i]);
			c.add(jb[i]);
			
		}
		setSize(500,200);
		setVisible(true);
		
	}
}
public class unit9_4 {

	public static void main(String[] args) {
		new prac4();

	}

}
