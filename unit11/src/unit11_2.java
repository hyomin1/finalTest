import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
class prac11_2 extends JFrame {
	JTextField tf = new JTextField(10);
	Vector<String> v = new Vector<String>();
	JComboBox<String> cb = new JComboBox<String>(v);
	
	prac11_2() {
		super("JTextField and JComboBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(tf);
		c.add(cb);
		tf.addActionListener(new action());
		
		setSize(300,300);
		setVisible(true);
	}
	class action implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JTextField t = (JTextField)e.getSource();
			v.add(t.getText());
			t.setText("");
			
			
		}
	}
}
public class unit11_2 {

	public static void main(String[] args) {
		new prac11_2();

	}

}
