import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class prac11_7 extends JFrame {
	JSlider js = new JSlider(JSlider.HORIZONTAL,1,96,1);
	JLabel la = new JLabel("I Love Java");
	prac11_7() {
		super("JSlider Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		js.setPaintLabels(true);
		js.setMajorTickSpacing(20);
		js.setPaintTicks(true);
		js.setMinorTickSpacing(5);
		js.addChangeListener(new changeFont());
		c.add(js,BorderLayout.NORTH);
		c.add(la,BorderLayout.CENTER);
		
		setSize(300,300);
		setVisible(true);
		
	}
	class changeFont implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			JSlider s = (JSlider)e.getSource();
			int value = s.getValue();
			la.setFont(new Font("Arial",Font.PLAIN,value));
		}
	}
}
public class unit11_7 {
	public static void main(String[] args) {
		new prac11_7();

	}
}
