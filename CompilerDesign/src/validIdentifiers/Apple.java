/*
 *program requirement
 *read a string and identify the valid identifiers within the string
 *consider the input file as one string then based on your definition of an identifier, determine whether
 *it is valid or not
 */


package validIdentifiers;

public class Apple {
	
	public static void main(String args[]){
		
		read rfOb = new read();

		rfOb.openFile();
		rfOb.readFile();
		rfOb.printTokens();
		rfOb.closeFile();
		
		}
}
