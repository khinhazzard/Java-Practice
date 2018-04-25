package pack_11JComboBox;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class gui extends JFrame{
	private JComboBox box;
	private JLabel picture;
	
	private static String[] filename = {"A.png", "X.png"};
	private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])),
						   new ImageIcon(getClass().getResource(filename[1]))};
	
	public gui(){ 
		super("The Tile");
		setLayout(new FlowLayout());
		
		box = new JComboBox(filename);
		
		box.addItemListener(
			new ItemListener(){
				public void itemStateChanged(ItemEvent event){
					if(event.getStateChange()==ItemEvent.SELECTED)
						picture.setIcon(pics[box.getSelectedIndex()]);
				}
			}
		);
		
		add(box);
		picture = new JLabel(pics[0]); //default picture
		add(picture);
		
	}
	
	
}
