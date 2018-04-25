package palindrome;

public class inspect {
	
	private String name;
	
	private char[] characters= {'A','B','C','D','E','F','G','H','I','J',
							'K','L','M','N','O','P','Q','R','S','T','Y','U','V',
							'W','X','Y','Z','1','2','3','4','5','6','7',
							'8','9','0'};
	
	public inspect(String s){
		name = s;
	}
		
	public int validate(){
		char temp_name[];
		char reversed[] = new char[20];
		int last_char;
		temp_name = name.toCharArray();
		last_char = name.length();
		reversed[last_char] = '*';
		
		//======================= validate characters =======================//
		int counter = 0;
		int equal;
		int vc_flag = 1; //valid character flag
		for(counter = 0;counter<last_char; counter++)
		{
			equal = 0;
			for(char c: characters)
			{
				if(temp_name[counter] == c){
					equal = 1; // equal
					break;
				}
			}
			if(equal == 0){
				vc_flag = 0; // not valid
				return 1;
			}
		}		 
		//==============================================================//
		
		
		//======================= validate length =======================//
		if(name.length()>=1 && name.length()<=20)
		{	
			//ok
		}
		else{
			return 1;
		}
		//==============================================================//
		
		return 0; // valid input
	}
	
	
	public void check(){
		//initialization
		char temp_name[];
		char reversed[] = new char[20];
		int last_char;
		temp_name = name.toCharArray();
		last_char = name.length();
		reversed[last_char] = '*';
		
		//========================= check palindrome =================================//
		
		//reverse temp_name
		int counter = last_char-1;
		for(char c: temp_name){

				reversed[counter] = c;
				counter--;
		}
		
		
		//compare temp_name & reverse if equal
		counter = 0;
		int p_flag=1; //palindrome flag
		for(char c: reversed){
			
			if(c == '*'){
				break;
			}
			else{
				if(c == temp_name[counter]){
				   counter++;
				}
				else{
					p_flag = 0;
					break;
				}
			}
		}
		
		//Uncomment to display Reversed name
		for(char c: reversed)
		{
			if(c != '*'){	
				System.out.printf("%c", c);	
			}
			else{
				break;
			}
		}
		System.out.println(" - Reversed");
		//======================================================================//
		
		
		
		
		//========================= check mirrored =================================//
		char mirror[] = new char[20];
		mirror[last_char] = '*';
		
		//reverse mirrored
		counter = last_char-1;
		for(char c: temp_name){
				
			if(c == '3'){
				mirror[counter] = 'E';
			}
			else{
				mirror[counter] = c;
			}
			
			switch(c){
			case 'E':{mirror[counter] = '3';break;}
			case 'J':{mirror[counter] = 'L';break;}
			case 'L':{mirror[counter] = 'J';break;}
			case 'S':{mirror[counter] = '2';break;}
			case '2':{mirror[counter] = 'S';break;}
			case '3':{mirror[counter]= 'E';break;}
			case '5':{mirror[counter] = 'Z';break;}
			case '8':{mirror[counter] = '8';break;}
			default:{mirror[counter] = c;break;}
			}
			counter--;
		}
		
		//compare mirror to temp_name
		counter = 0;
		int m_flag = 1; //mirror flag
		for(char c: mirror){
			
			if(c == '*'){
				break;
			}
			else{
				if(c == temp_name[counter]){
				   counter++;
				}
				else{
					m_flag = 0;
					break;
				}
			}
		}

		//Uncomment to display Mirrored name
		
		for(char c: mirror)
		{
			if(c != '*'){	
				System.out.printf("%c", c);	
			}
			else{
				break;
			}
		}
		System.out.println(" - Mirrored");


		
		//======================================================================//
		
		
		//========================= Display output =============================//
		
		if(p_flag == 1 && m_flag == 1)
		{
			System.out.printf("%s -- is a mirrored palindrome\n", name);
		}
		else if(m_flag == 1){
			System.out.printf("%s -- is a mirrored string\n", name);
		}
		else if(p_flag == 1){
			System.out.printf("%s -- is a regular palindrome\n", name);
		}
		else{
			System.out.printf("%s -- is not a palindrome\n", name);
		}
		//======================================================================//
	}
}
