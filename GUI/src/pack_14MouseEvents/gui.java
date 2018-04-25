package pack_14MouseEvents;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class gui extends JFrame{
	
	private JPanel mousepanel;
	private JLabel statusbar;
	
	public gui(){
		
		super("title");
		
		mousepanel = new JPanel();
		mousepanel.setBackground(Color.WHITE);
		add(mousepanel, BorderLayout.CENTER);
		
		statusbar = new JLabel("default");
		add(statusbar, BorderLayout.SOUTH);
		
		handlerClass handler = new handlerClass();
		mousepanel.addMouseListener(handler);
		mousepanel.addMouseMotionListener(handler);
	}
	
	private class handlerClass implements MouseListener,MouseMotionListener{
		public void mouseClicked(MouseEvent event){
			JOptionPane.showMessageDialog(null,String.format("Clicked at %d,%d", event.getX(), event.getY()));
		}
		public void mousePressed(MouseEvent event){
			statusbar.setText("your pressed down the mouse");		}
		
		public void mouseReleased(MouseEvent event){
			statusbar.setText("you released the button");
		}
		public void mouseEntered(MouseEvent event){
			mousepanel.setBackground(Color.ORANGE);
			JOptionPane.showMessageDialog(null,"You entered the area");
		}
		public void mouseExited(MouseEvent event){
			statusbar.setText("you left the window");
			mousepanel.setBackground(Color.WHITE);
		}
		
		//these are mouse motion events
		
		public void mouseDragged(MouseEvent event){
			statusbar.setText("your are dragging the mouse");
			}
		
		public void mouseMoved(MouseEvent event){
			statusbar.setText("you moved the mouse");
			}
		
		}
}
