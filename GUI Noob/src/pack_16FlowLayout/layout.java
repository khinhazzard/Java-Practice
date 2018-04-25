package pack_16FlowLayout;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class layout extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton lb;
	private JButton cb;
	private JButton rb;
	private FlowLayout layout;
	private Container container;
	
	public layout(){
		super("Title");
		layout = new FlowLayout();
		container = getContentPane();
		setLayout(layout);
		
		
		//left stuff in here
		lb = new JButton("left");
		add(lb);
		lb.addActionListener(
				new ActionListener(){
					public void	actionPerformed(ActionEvent event){
						layout.setAlignment(FlowLayout.LEFT);
						layout.layoutContainer(container);
					}
				}
		);
		
		//center stuff in here
		cb = new JButton("center");
		add(cb);
		cb.addActionListener(
				new ActionListener(){
					public void	actionPerformed(ActionEvent event){
						layout.setAlignment(FlowLayout.CENTER);
						layout.layoutContainer(container);
					}
				}
		);
		
		//right stuff in here
		rb = new JButton("right");
		add(rb);
		rb.addActionListener(
				new ActionListener(){
					public void	actionPerformed(ActionEvent event){
						layout.setAlignment(FlowLayout.RIGHT);
						layout.layoutContainer(container);
					}
				}
		);
		
	}
}
