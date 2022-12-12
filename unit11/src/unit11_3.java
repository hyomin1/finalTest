import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
class prac11_3 extends JFrame {
	String moneyUnit[] = {"오만원","만원","천원","500원","100원","50원","10원","1원"};
	int money[] = {50000,10000,1000,500,100,50,10,1};
	int resMoney[] = new int[money.length];
	JLabel la[] = new JLabel[moneyUnit.length];
	JTextField res[] = new JTextField[moneyUnit.length];
	JTextField tf = new JTextField(10);
	JButton btn = new JButton("계산");
	JTextField source = new JTextField(30);
	prac11_3() {
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
		setSize(300,300);
		setVisible(true);
		
	}
	class ActionCalculate implements ActionListener  {
		public void actionPerformed(ActionEvent e) {
			int cal = Integer.parseInt(source.getText());
			for(int i=0;i<money.length;i++) {
				resMoney[i] = cal/money[i];
				cal -= (money[i]*resMoney[i]);
				res[i].setText(Integer.toString(resMoney[i]));
			}
			
		}
	}
}
public class unit11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new prac11_3();

	}

}
