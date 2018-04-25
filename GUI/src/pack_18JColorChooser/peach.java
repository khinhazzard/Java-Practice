package pack_18JColorChooser;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class peach extends JFrame{

	private JButton b;
	private JPanel panel;
	private Color color = (Color.WHITE);
	
	public peach(){
		super("Title");
		panel = new JPanel();
		panel.setBackground(color);
		
		b = new JButton("Choose a color");
		b.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						color = JColorChooser.showDialog(null, "pick your color", color);
						if(color == null)
							color = Color.WHITE;
						
						panel.setBackground(color);
					}
				}
	);
	
	add(panel, BorderLayout.CENTER);
	add(b, BorderLayout.SOUTH);
	setSize(450, 150);
	setVisible(true); 
	
	}
}
