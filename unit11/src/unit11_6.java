import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
class prac11_6 extends JFrame {
	JTextArea ta = new JTextArea(4,20);
	JSlider slider = new JSlider(JSlider.HORIZONTAL,0,100,0);
	prac11_6() {
		super("TextArea Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		

		slider.setMajorTickSpacing(20);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(5);
		slider.addChangeListener(new changeListener());
		ta.addKeyListener(new KeyInput());
		
		c.add(ta,BorderLayout.NORTH);
		c.add(slider,BorderLayout.SOUTH);
		setSize(300,200);
		setVisible(true);
	}
	class KeyInput extends KeyAdapter {
		public void keyTyped(KeyEvent e) {
			JTextArea t = (JTextArea)e.getSource();
			String text = t.getText();
			if(text.length()<=100)
				slider.setValue(text.length());
			else {
				text = text.substring(0,99);
				ta.setText(text);
			}
		}
	}
	class changeListener implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			JSlider s = (JSlider)e.getSource();
			String text = ta.getText();
			if(text.length()<=slider.getValue())
				slider.setValue(text.length());
			else {
				ta.setText(text.substring(0,s.getValue()));
			}

		}
	}
}
public class unit11_6 {

	public static void main(String[] args) {
		new prac11_6();

	}

}
