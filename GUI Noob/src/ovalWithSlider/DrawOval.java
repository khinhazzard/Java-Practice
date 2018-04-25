package ovalWithSlider;

import javax.swing.*;
import java.awt.*;

public class DrawOval extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int d = 10; //diameter;
	
	public void paintComponent(Graphics g){
		super.paintComponent(g); 
		g.fillOval(15, 15, d, d);
	}
	
	public void setD(int newD){
		
		d = (newD >= 0 ? newD : 10);
		repaint();
	}
	
	public Dimension getPreferrendSize(){//uses layout manager to determine the layout size
		
		return new Dimension(200,200);
	}
	
	public Dimension getMinimumSize(){
		return getPreferredSize();
	}
	
}
