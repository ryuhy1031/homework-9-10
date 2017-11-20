package homework8;
import javax.swing. *;
import java.awt.*;

public class BorderLayoutEx extends JFrame {
	public BorderLayoutEx() {
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout(30, 20));
		c.add(new JButton("CENTER"), BorderLayout.CENTER);
		c.add(new JButton("NORTH"), BorderLayout.NORTH);
		c.add(new JButton("SOUTH"), BorderLayout.SOUTH);
		c.add(new JButton("EAST"), BorderLayout.EAST);
		c.add(new JButton("WEST"), BorderLayout.WEST);
		
		setSize(300, 200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new BorderLayoutEx();
	}

}
