package homework8;

import java.awt.*;
import javax.swing.*;

public class Plate4x4Frame extends JFrame {
	public Plate4x4Frame() {
		super("10x10 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(10, 10));
		
		JLabel [] label = new JLabel [100];
		Color [] color = {Color.BLUE,Color.WHITE}; 

		for(int i=0; i<label.length; i++) {
			label[i] = new JLabel(Integer.toString(i));
			label[i].setOpaque(true);
			label[i].setBackground(color[i]);
			c.add(label[i]);
		}
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Plate4x4Frame();
	}

}
