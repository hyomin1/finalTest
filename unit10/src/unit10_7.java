import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class prac10_7 extends JFrame {
	JLabel la = new JLabel("Love Java");
	prac10_7() {
		super("마우스 휠을 굴려 폰트 크키 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(la);
		la.setFont(new Font("Arial",Font.PLAIN,10));
		la.addMouseWheelListener(new MouseWheel());
		setSize(300,150);
		setVisible(true);
	}
	class MouseWheel extends MouseAdapter {
		public void mouseWheelMoved(MouseWheelEvent e) {
			int n = e.getWheelRotation();
			if(n<0) {
				Font f = la.getFont();
				int size = f.getSize();
				if(size<=5)
					la.setFont(new Font("Arial",Font.PLAIN,5));
				else 
					la.setFont(new Font("Arial",Font.PLAIN,size-5));
			}
			else {
				Font f = la.getFont();
				int size = f.getSize();
				la.setFont(new Font("Arial",Font.PLAIN,size+5));
			}
		}
	}
}
public class unit10_7 {

	public static void main(String[] args) {
		new prac10_7();

	}

}
