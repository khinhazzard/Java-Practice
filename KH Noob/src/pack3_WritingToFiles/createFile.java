package pack3_WritingToFiles;

import java.util.*;

public class createFile {
	
	private Formatter x;
	
	public void openFile(){
		try{
			x = new Formatter("tisha.txt");
		}
		catch(Exception e){
			System.out.println("You've got an error");
		}
	}
	
	public void addRecords(){
		x.format("%s%s%s", "Teresita ", "16 ", "Cute");	
		x.format("\n%s%s%s", "Daisy ", "17 ", "Hottie");	
		x.format("\n%s%s%s", "Nemia ", "23 ", "Wild");	
		x.format("\n%s%s%s", "Tinaang Koi ", "14 ", "Tempting");	
	}
	
	public void closeFile(){
		x.close();
	}
	
}
