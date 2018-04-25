package pack1GUIwJFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class orange extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel item1;
	
	public orange(){
		
		super("The title bar");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("This is a sentence");
		item1.setToolTipText("This is gonna show up on hover");
		add(item1);		
	}

}
