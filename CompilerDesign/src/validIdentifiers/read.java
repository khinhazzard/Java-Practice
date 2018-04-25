//try: get tokens by string
//     check each char of the string if there's an invalid letter
//	   while string contains a non-letter or non-number


//Rules in forming identifier:
// -Identifiers must start with a letter(ignore casing) 
// -Succeeding characters can be a letter(ignore casing) or an integer or an underscore.
// -Can only end with a letter(ignore casing) or an integer or an underscore.

//check program to read comments
//check syntax errors

//requirements: identifiers, reserved words, comments, declaration, assigments, structure

package validIdentifiers;

//Rules in forming identifier:
//-Identifiers must start with a letter(ignore casing) 
//-Succeeding characters can be a letter(ignore casing) or an integer or an underscore.
//-Can only end with a letter(ignore casing) or an integer or an underscore.

//method that will detect a valid assignment statement
//format:  	<assignment> ::= <identifier> '=' <identifier> ';'
//		 	<assignment> ::= <identifier> '=' <value> ';'
// 			<assignment> ::= <identifier> '=' <expression> ';'

import java.io.*;
import java.util.*;

public class read {
	
	private Scanner x;
	
	private String[] keywords ={"if", "else","return","do",	"while", "for",
								"switch","case","break","default", "mark", "take","void"};	
	private String[] dkeywords ={"int", "string", "char", "double"};
	private String[] brackets ={"{", "(","[", "]", ")", "}"};
	private String[] delimiters = { "," , ";","'"};
	private char[] letters = {'a','b','c','d','e','f','g','h','i','j','l','l','m','n','o','p','q','r','s','t','u',
							  'v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O',
							  'P','Q','R','S','T','U','V','W','X','Y','Z'};
	private char[] numbers = {'0','1','2','3','4','5','6','7','8','9'};
	List<String> tokens = new LinkedList<String>();
	List<String> assignment = new LinkedList<String>();
	List<String> declaration = new LinkedList<String>();

	public void openFile(){
		try{
			x = new Scanner(new File("tisha.txt"));
		}
		catch(Exception e){
			System.out.println("Could not find file");
		}
	}
	
	public void readFile(){
		while(x.hasNext()){ //while the file x has string in it
			
			String a = x.next(); //store it to x
			addToken(a);
		}
	}
	
	public void printTokens(){
		int flag, ch, af, flagc ,//flag for comments
		    dc, //declaration counter
		    ac; //assignment counter
		    flagc = 0;
		    ac = 0;
		    dc = 0;
		    
		for(String a:tokens){
			flag = 0; 
			ch =0;
			af = 0;
			//display comments
			if(flagc == 1){
				//display comments until "//" is encountered
				if(a.equalsIgnoreCase("//")){
					flagc = 0;
					flag = 1;
					System.out.println("- comment ");	
				}
				else{
					System.out.printf("%s ", a);					
				}
			}	
			
			if(flagc == 0){
				
			//check if its a comment delimiter
			if(flag ==0){
				if(a.equalsIgnoreCase("//")){
					flag = 1;
					flagc = 1;
				}
			}
			
			//check if its a keyword
			if(flag ==0){
			for(String check: keywords){
				if(a.equalsIgnoreCase(check)){
					System.out.printf("%s - keyword\n", a);
		 			flag = 1;
		 			break;
				}
			}
			}
			
			//check if its a data type keyword
			if(flag ==0){
				for(String check: dkeywords){
					if(a.equalsIgnoreCase(check)){
						System.out.printf("%s - data type keyword\n", a);
			 			flag = 1;
			 			dc = 1;
			 			declaration.add(a);
			 			break;
					}
				}
			}
			
			//check if its a number
			for(char check: numbers){
				if(a.charAt(0) == (check)){
					
					if(a.length() == 1){
						System.out.printf("%s - number\n", a);
						flag = 1;
						if(ac > 1){
							ac++;
							assignment.add(a);
						}
			 			break;
					}
					else{
						//if it contains a non-number do this
						for(char check2: letters){
							if(a.indexOf(check2) == -1){ //returns -1 if it does not exist in the string
							 //just continue with the loop 				
							}
							else{
								System.out.printf("%s - invalid\n", a);
								flag = 1;
					 			break;
							}
						}
						if(flag !=1){
							System.out.printf("%s - number\n", a);
							flag = 1;
							if(ac > 1){
								ac++;
								assignment.add(a);
							}
							break;
						}
					}
				}
			}
			
			//check if its a delimiter
			for(String check: delimiters){
					if(a.length() == 1){
						if(a.equals(check)){
							System.out.printf("%s - Delimiter\n", check);
							break;
						}
					}
			}
			
			//check if its a bracket
			for(String check: brackets){
				if(a.equals(check)){
					ch = 1;
						System.out.printf("%s - Bracket\n", a);
						flag = 1;				
						break;
				}
			}

			//check if string is a valid identifier
			if (flag == 0){
				//if the string starts with a letter
				for(char check: letters){	
					if(a.charAt(0) == (check)){
						
						
						//if the succeeding character is a letter, number or underscore
						int i = 1;
						while(i<a.length()-1){
							for(char check2: letters){
								if(a.charAt(i) == check2 || a.charAt(i) == '_'){		
									i++;
									flag = 1;
									ch = -1;
									break;
								}
								else{
									ch = 1;
								}
							}
							
							if(ch == 1){
								for(char check3: numbers){
									if(a.charAt(i) == check3 || a.charAt(i) == '_'){		
										i++;
										break;
									}
									else{
										flag = -1;
										break;
									}
								}
							}					
						}	
					}
				}
						if(flag == -1){
							System.out.printf("%s - invalid identifier", a);
							break;
						}
						
							//if it ends with characters or numbers or underscore
							for(char check2: letters){
								if(a.charAt(a.length()-1) == check2){
									System.out.printf("%s - Indentifier\n", a);
									flag = 1;
									break;
								}
							}
							
							for(char check2: numbers){
								if(a.charAt(a.length()-1) == check2){
									System.out.printf("%s - 	Indentifier\n", a);
									flag = 1;
									break;
								}
							}
							
							if(a.charAt(a.length()-1) == ('_')){
								System.out.printf("%s - Indentifier\n", a);
								flag = 1;
								break;
							}

					if(flag == 1 && (ac == 0|| ac == 2)){
						ac++;
						af = 1;
						assignment.add(a);
					}
					
					if(flag == 1 && dc > 0){
						dc++;
						declaration.add(a);
					}
			  }
			
			//declaration check
			if(dc > 0){
				if(dc > 1){					
					if(a.equals(";")){
						dc++;
						declaration.add(a);
						printDec();
						dc = 0;
						declaration.clear();	
					}
					if(a.equals(",")){
						dc++;
						declaration.add(a);
					}
				}
			}
			
			//check if its an equal
			if(af == 0 || af == 2){
				if(flag == 0 || ac>2){
					if(a.equals("=") && ac > 0){
						ac++;
						assignment.add(a);
						System.out.printf("%s - assignment operator\n", a);
					}
					if(a.equals(";") && ac > 2){
						ac++;
						assignment.add(a);
					}
				}	
				else{
					ac = 0;
					assignment.clear();
				}
			}	
		   }
			if(ac >= 4){
				printAssign();
				ac = 0;
			}
		}
	}
	
	//method to print a valid assignment statement
	public void printAssign(){
		for(String b:assignment)
			System.out.printf("%s ", b);		
		System.out.printf("- assignment statement \n");
		assignment.clear();
	}
	
	//method to print a valid declaration statement
	public void printDec(){
		for(String b:declaration)
			System.out.printf("%s ", b);		
		System.out.printf("- declaration statement \n");
		declaration.clear();
	}
	

	
	//method that will store tokens in a linked lists
	public void addToken(String a){
		String s; 
		int ch =0;

		for(String check: brackets){
			if(a.contains(check) && a.length()>1){
				s = a.substring(0, a.indexOf(check));
				tokens.add(s);
				tokens.add(check);
				ch = 1;
				break;
			}
			if(a.length() == 1){
				ch = 1;
				tokens.add(a);
				break;
			}
		}	

		if(ch == 0){
			for(String check: delimiters){
				if(a.contains(check) && a.length()>1){
					s = a.substring(0, a.indexOf(check));
					tokens.add(s);
					tokens.add(check);
					ch = 1;
					break;
				}
				if(a.length() == 1){
					ch = 1;
					tokens.add(a);
					break;
				}
			}
		}
		if(ch == 0){
			tokens.add(a);
		}
	}
	
	public void closeFile(){
		x.close();
	}
}