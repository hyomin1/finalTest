import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class prac11_1 extends JFrame {
	JButton btn = new JButton("text button");
	JCheckBox b1 = new JCheckBox("버튼 비활성화");
	JCheckBox b2 = new JCheckBox("버튼 감추기");
	prac11_1() {
		super("CheckBox Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.add(b1);
		c.add(b2);
		c.add(btn);
		b1.addItemListener(new checkItem());
		b2.addItemListener(new checkItem());
		
		setSize(300,150);
		setVisible(true);
	}
	class checkItem implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.SELECTED) {
				if(e.getItem()==b1)
					btn.setEnabled(false);
				else
					btn.setVisible(false);
			}
			else {
				if(e.getItem()==b1)
					btn.setEnabled(true);
				else
					btn.setVisible(true);
			}
		}
	}
}
public class unit11_1 {

	public static void main(String[] args) {
		new prac11_1();

	}

}
