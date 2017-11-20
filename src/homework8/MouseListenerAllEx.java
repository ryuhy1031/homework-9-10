package homework8;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseListenerAllEx extends JFrame {
	private JLabel la = new JLabel("No Mouse Event");
	
	public MouseListenerAllEx() {
		setTitle("MouseListener�� MouseMotionListener ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		
		c.add(la);
		setSize(300, 200);
		setVisible(true);
	}
	
	class MyMouseListener implements MouseListener, MouseMotionListener{
		public void mousePressed(MouseEvent e) {
			la.setText("mousePressed("+e.getX()+","+e.getY()+")");
		}
		
		public void mouseReleased(MouseEvent e) {
			la.setText("MouseReleased("+e.getX()+","+e.getY()+")");
			
		}
		
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.GREEN);
		}
		
		public void mouseExited(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.YELLOW);
		}
		
		public void mouseDragged(MouseEvent e) {
		
			
		}
		public void mouseMoved(MouseEvent e) {
		
		}
		
	}
	
public static void main(String [] args) {
	new MouseListenerAllEx();
	}
}