import javax.swing.*;
import java.awt.*;

public class init4Applets extends JApplet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double sum;
	
	public void init(){
		String fn = JOptionPane.showInputDialog("Enter first number: ");
		String sn = JOptionPane.showInputDialog("Enter second number: ");
		
		double n1 = Double.parseDouble(fn); //converts the string into double
		double n2 = Double.parseDouble(sn);
		
		sum = n1+n2;
	
	}
	
	public void paint(Graphics g){
		super.paint(g);
		g.drawString("the sum is " + sum, 25, 25);
		
	}

}
