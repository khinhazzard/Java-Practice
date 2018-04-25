package pack9JCheckBox;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class gui extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField tf;
	private JCheckBox boldCB;
	private JCheckBox italicCB;
	
	public gui(){
		super("The Title");
		setLayout(new FlowLayout());
		
		tf = new JTextField("This is a sentence", 20);
		tf.setFont(new Font("Seriff", Font.PLAIN, 14));
		
		boldCB = new JCheckBox("bold");
		italicCB = new JCheckBox("italic");
		 
		add(tf);
		add(boldCB);
		add(italicCB);
		
		handlerClass handler = new handlerClass();
		boldCB.addItemListener(handler);
		italicCB.addItemListener(handler);
		
	}
	
	private class handlerClass implements ItemListener{//implements to use all method from ItemListener
		
		public void itemStateChanged(ItemEvent event){
			Font font = null;
			
			if(boldCB.isSelected() && italicCB.isSelected())
				font = new Font("Seriff",  Font.BOLD+Font.ITALIC, 14);
			else if(boldCB.isSelected())
				font = new Font("Seriff",  Font.BOLD, 14);
			else if(italicCB.isSelected())
				font = new Font("Seriff",  Font.ITALIC, 14);
			else
				font = new Font("Seriff", Font.PLAIN, 14);
			
			tf.setFont(font);
		}
		
	}

}
