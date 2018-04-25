package pack8JButton;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class gui extends JFrame{
	
	private JButton reg; //regular
	private JButton custom; //for images
	
    public gui(){
		super("The Title");
		setLayout(new FlowLayout());
		
		reg = new JButton("Reg Button"); // method that creates a Button
		
		Icon A = new ImageIcon(getClass().getResource("A.png"));
		Icon X = new ImageIcon(getClass().getResource("X.png"));
		custom = new JButton("Custom", A);
		custom.setRolloverIcon(X);	
		
		add(reg);
		add(custom);
				
		handlerClass handler = new handlerClass();
		reg.addActionListener(handler);
		custom.addActionListener(handler);
		
	}
	
	private class handlerClass implements ActionListener{
		public void actionPerformed(ActionEvent event){
			
			JOptionPane.showMessageDialog(null, String.format("%s ", event.getActionCommand()));
		}
	}
	
}
