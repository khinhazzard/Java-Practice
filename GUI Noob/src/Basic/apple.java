package Basic;
import javax.swing.JOptionPane;

public class apple {
	public static void main(String args[]){
	
		String fn = JOptionPane.showInputDialog("Enter first number "); //test to see
		String sn = JOptionPane.showInputDialog("Enter second number ");
		
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		int sum = num1+num2;
		
									//position //message     //title
		JOptionPane.showMessageDialog(null, "The sum is "+sum, "The title", JOptionPane.PLAIN_MESSAGE);
		
	}  

}