package pack_12JList;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class gui extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JList list;
	private String[] colornames={"black", "blue", "white", "red"};
	private Color[] colors={Color.BLACK, Color.BLUE, Color.WHITE, Color.RED};
	
	public gui(){
		super("title");
		setLayout(new FlowLayout());
		
		list = new JList(colornames);
		list.setVisibleRowCount(4); //sets the default row count or options for the list
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // to select one option one at a time
		add(new JScrollPane(list));
		
		list.addListSelectionListener(
		
				new ListSelectionListener(){
					public void valueChanged(ListSelectionEvent event){
						//setting the background 
						getContentPane().setBackground(colors[list.getSelectedIndex()]);
						
					}
				}
		
		);
	
	}
	
	
	
	
}
