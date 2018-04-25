package pack_15AdapterClasses;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class gui extends JFrame{
	
	private JLabel statusbar;
	private String details;
	
	public gui(){
		super("Adapter Classes");
		
		statusbar = new JLabel("this is the default");
		add(statusbar,BorderLayout.SOUTH);
		
		addMouseListener(new mouseClass());
	}
	
	private class mouseClass extends MouseAdapter{ //you can set one or few methods of the mouse events
		public void mouseClicked(MouseEvent event){
			details = String.format("You clicked %d", event.getClickCount());
			
			if(event.isMetaDown())
				details += " with the right mouse button";
			else if(event.isAltDown())
				details += " with the center mouse button";
			else
				details += " with the left mouse button";
			
			statusbar.setText(details);
		}
	}
}
