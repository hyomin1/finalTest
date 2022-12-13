import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class prac11_10 extends JFrame {
	JLabel la[] = new JLabel[10];
	int cnt = 0;
	prac11_10() {
		super("Ten 레이블 클릭");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		for(int i=0;i<la.length;i++) {
			int x = (int)(Math.random()*300+10);
			int y = (int)(Math.random()*300+10);
			la[i] = new JLabel(Integer.toString(i));
			la[i].setLocation(x,y);
			la[i].setSize(20,20);
			la[i].setOpaque(true);
			la[i].setForeground(Color.magenta);
			c.add(la[i]);
			la[i].addMouseListener(new clickNumber());
		}

		
		
		
		
		setSize(400,400);
		setVisible(true);
		
	}
	class clickNumber extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			JLabel l = (JLabel)e.getSource();
			l.setVisible(false);
			cnt++;
			if(cnt==10) {
				for(int i=0;i<la.length;i++) {
					int x = (int)(Math.random()*300+10);
					int y = (int)(Math.random()*300+10);
					la[i].setLocation(x,y);
					la[i].setVisible(true);
				
				}
				cnt=0;
			}
	}
	

	}
	
}
public class unit11_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new prac11_10();

	}

}
