import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
class prac11_5 extends JFrame {
	JLabel la = new JLabel("");
	JSlider slider = new JSlider(JSlider.HORIZONTAL,100,200,100);
	prac11_5() {
		super("JSlider Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(20);
		slider.setPaintTicks(true);
		la.setOpaque(true);
		la.setBackground(Color.GREEN);
		c.add(slider);
		c.add(la);
		slider.addChangeListener(new change());
		
		setSize(350,200);
		setVisible(true);
	}
	class change implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			la.setText(Integer.toString(slider.getValue()));
			
		}
	}
}
public class unit11_5 {

	public static void main(String[] args) {
		new prac11_5();

	}

}
