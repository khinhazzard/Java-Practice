//plan
//read file
//store valid tokens in a linked list...
//tokens will strings, brackets and delimiters individually
//read the list and identify what type of token each..
//close file

import java.io.*;
import java.util.*;

public class read {

	private Scanner x;
	private String[] keywords ={"if", "else","return","do",	"while", "for", "int",
							   "String","double","char","switch","case","break","default", "mark", "take","void"};
	private String[] brackets ={"{", "(","[", "]", ")", "}"};
	private String[] delimiters = { "," , ";","'"};
	private String[] chars = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q",
							   "r", "s", "t", "u", "v", "w","x","y","z","A","B","C","D","E","F",
							  "G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V",
							  "W","X","Y","Z"};
	private String[] numbers = {"0","1","2","3","4","5","6","7","8","9","10"};
	private String[] operators = {"=","+","-","/", "<<", ">>"};
	public void openFile(){
		try{
			x = new Scanner(new File("tisha.txt"));
		}
		catch(Exception e){
			System.out.println("Could not find file");
		}
	}

	public void readFile(){
		while(x.hasNext()){      //while the file x has something in it
			int flag = 0, ch = 0;
			String a = x.next();
			
			
			while(true){
				//check if its a Bracket
				for(String check: brackets){
					// not attached
					if(a.startsWith(check)){
						ch = 1;
						if(a.length() == 1){
							System.out.printf("%s - Bracket\n", a);
							flag = 1;				
							break;
						}
						// attached
						else{
							System.out.printf("%s - Bracket\n", a.charAt(0));
							//removes attachement
							String s = a;
							a = s.replace(check, "");
							break;
						}
					}
				}
				
				if(flag == 1 || ch == 0)
					break;
			}
 		
			//check if its a delimiter
			for(String check: delimiters){
					//not attached
					if(a.length() == 1){
						if(a.equals(check)){
							System.out.printf("%s - Delimiter\n", check);
							flag = 1;
							break;
						}
					}

					//attached
					else if(a.contains(check)){
						System.out.printf("%s - Delimiter\n", check);
						flag = 1;
						break;
					}
			}
			
			//check if its a keyword
			for(String check: keywords){
				if(check.equalsIgnoreCase(a)){
		 			System.out.printf("%s - Keyword  \n", a);
		 			flag = 1;
		 			break;
				}
			}
			
			//check if its an identifier
			if (flag == 0){
				for(String check: chars){
					if(a.startsWith(check)){
						//if it ends with characters
						for(String check2: chars){
							if(a.endsWith(check2)){
								System.out.printf("%s - Indentifier\n", a);
								flag = 1;
								break;
							}
						}
						//if it ends with numbers
						for(String check2: numbers){
							if(a.endsWith(check2)){
								System.out.printf("%s - Indentifier\n", a);
								flag = 1;
								break;
							}
						}
					}	
				}
			}
			
			//check if its a number
			for(String check: numbers){
				if(a.startsWith(check)){	
					for(String check2: numbers){
						if(a.endsWith(check2)){
							System.out.printf("%s - Number\n", a);
							flag = 1;
							break;
						}
					}					
				}
			}
			
			//check if its an operator
			for(String check: operators){
				if(a.equalsIgnoreCase(check)){
					System.out.printf("%s - Operator\n", a);
					flag = 1;
				}
				
			}
					
			//its invalid
			if(flag == 0)
			 System.out.printf("%s - Invalid  \n", a);
		}
	}

	public void closeFile(){
		x.close();
	}
	
	public void checkBrackets(){
		
	}	
}