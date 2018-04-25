package pack_10JRadioButton;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class gui extends JFrame{
	
	private JTextField tf;
	private Font pf, //plain font
				 bf, //bold font
				 itf, //italic font
				 bif; //bold italic font
	
	private JRadioButton pb,
						 bb,
						 ib,
						 bib;
	
	private ButtonGroup group;
	
	public gui(){
		super("Title bar");
		setLayout(new FlowLayout());
		
		tf = new JTextField("Khine is awesome and hot", 30);
		pb = new JRadioButton("plain", true);
		bb = new JRadioButton("bold", false);
		ib = new JRadioButton("italic", false);
		bib = new JRadioButton("bold-italic", false);
		
		add(pb);
		add(bb);
		add(ib);
		add(bib);
		
		//grouping buttons so that only 1 button can be selected
		group = new ButtonGroup();
		group.add(pb);
		group.add(bb);
		group.add(ib);
		group.add(bib);
		
		
		pf = new Font("Seriff", Font.PLAIN, 14);
		bf = new Font("Seriff", Font.ITALIC, 14);
		itf = new Font("Seriff", Font.BOLD, 14);
		bif = new Font("Seriff", Font.BOLD + Font.ITALIC, 14);
		tf.setFont(pf);
		add(tf);
		
		//wait for event to happen, passes font objects to constructor
		pb.addItemListener(new handlerClass(pf));
		bb.addItemListener(new handlerClass(bf));
		ib.addItemListener(new handlerClass(itf));
		bib.addItemListener(new handlerClass(bif));

	}
	
	private class handlerClass implements ItemListener{
		private Font font;
		
		//font object get variable font
		public handlerClass(Font f){
			font= f;
		}
		
		//sets font to the font object that was passed in
		public void itemStateChanged(ItemEvent event){
			tf.setFont(font);
		}
		
		
	}
}
