package pack_13Multiple_Selection_List;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class gui extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JList rightList;
	public JList leftList;
	public JButton	moveButton;
	public String[] foods = {"oatmeal", "blueberries", "dark chocolates", "salmon", "walnuts"};
	
	public gui(){
		
		super("The title");
		setLayout(new FlowLayout());
		
		leftList = new JList(foods);
		leftList.setVisibleRowCount(3);
		leftList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); //allows multiple options
		add(new JScrollPane(leftList));
		
		moveButton = new JButton("Move -->");
		moveButton.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						//set the things we want on the list
						rightList.setListData(leftList.getSelectedValues());
					}
				}
		);
		add(moveButton);
		
		rightList = new JList(); //no list by default
		rightList.setVisibleRowCount(3);
		rightList.setFixedCellHeight(50);
		rightList.setFixedCellWidth(200);
		rightList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(rightList));
		
		
	}
	

}
