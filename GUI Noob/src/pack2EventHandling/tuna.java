package pack2EventHandling;

import java.awt.FlowLayout;
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class tuna extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	
	private JPasswordField passwordField;
	
	public tuna(){
		
		super("The title");
		setLayout(new FlowLayout()); 
		
		item1 = new JTextField(10);
		add(item1);
		
		item2 = new JTextField("Enter Text Here");
		add(item2);
		
		item3 = new JTextField("uneditable", 10);
		item3.setEditable(false);
		add(item3);
		
		passwordField = new JPasswordField("mypass");
		add(passwordField);
		
		thehandler handler = new thehandler(); // builds an action listener obj
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		passwordField.addActionListener(handler);
	}
	
	private class thehandler implements ActionListener{//class that handles events
		
		public void actionPerformed(ActionEvent event){
			
			String string = "";
			
			if(event.getSource()==item1)
				string = String.format("Field 1: %s", event.getActionCommand()); //enter
			else if(event.getSource()==item2)
				string = String.format("Field 2: %s", event.getActionCommand());
			else if(event.getSource()==item3)
				string = String.format("Field 3: %s", event.getActionCommand());
			else if(event.getSource()==passwordField)
				string = String.format("PasswordField: %s", event.getActionCommand());
			
			JOptionPane.showMessageDialog(null,string); 
			
		}
		
	}
	
}
