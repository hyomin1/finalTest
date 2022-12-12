import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
class prac11_4 extends JFrame {
	String moneyUnit[] = {"오만원","만원","천원","500원","100원","50원","10원","1원"};
	int money[] = {50000,10000,1000,500,100,50,10,1};
	int resMoney[] = new int[money.length];
	JLabel la[] = new JLabel[moneyUnit.length];
	JTextField res[] = new JTextField[moneyUnit.length];
	JTextField tf = new JTextField(10);
	JButton btn = new JButton("계산");
	JTextField source = new JTextField(30);
	JCheckBox cb[] = new JCheckBox[moneyUnit.length-1];
	boolean checking[] = {false,false,false,false,false,false,false,true};
	prac11_4() {
		super("Money Changer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.pink);
		c.setLayout(null);
		JLabel l = new JLabel("금액");
		l.setSize(30,20);
		l.setLocation(20,20);
		c.add(l);
		
		
		source.setSize(110,20);
		source.setLocation(80, 20);
		c.add(source);
		
		btn.setSize(70,20);
		btn.setLocation(200,20);
		c.add(btn);
		btn.addActionListener(new ActionCalculate());
		btn.addItemListener(new ItemCalculate());
		
		for(int i=0;i<moneyUnit.length;i++) {
			la[i] = new JLabel(moneyUnit[i]);
			res[i] = new JTextField(15);
			
			la[i].setSize(50,20);
			la[i].setHorizontalAlignment(JLabel.RIGHT);
			la[i].setLocation(50,50+i*20);
			res[i].setHorizontalAlignment(JTextField.CENTER);
			res[i].setSize(70,20);
			res[i].setLocation(120,50+i*20);
		
			c.add(la[i]);
			c.add(res[i]);
			
		}
		for(int i=0;i<cb.length;i++) {
			cb[i] = new JCheckBox();
			cb[i].setSize(30,15);
			cb[i].setLocation(200, 50+i*20);
			cb[i].setOpaque(false);
			cb[i].addItemListener(new ItemCalculate());
			c.add(cb[i]);
		}
		setSize(300,300);
		setVisible(true);
		
	}
	class ActionCalculate implements ActionListener  {
		public void actionPerformed(ActionEvent e) {
			int cal = Integer.parseInt(source.getText());
			for(int i=0;i<money.length;i++) {
				res[i].setText("");
			}
			for(int i=0;i<money.length;i++) {
				if(checking[i]==true) {
					resMoney[i] = cal/money[i];
					cal -= (money[i]*resMoney[i]);
					res[i].setText(Integer.toString(resMoney[i]));
				}

			}
			
		}
	}
	class ItemCalculate implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			
			if(e.getStateChange()==ItemEvent.SELECTED)  {
				for(int i=0;i<cb.length;i++) {
					if(e.getItem()==cb[i]) {
						checking[i]=true;
					}
				}
			}
			else {
				for(int i=0;i<cb.length;i++)
					if(e.getItem()==cb[i])
						checking[i]=false;
			}
		}
	}
}
public class unit11_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new prac11_4();

	}

}
