package job_exam;

//6:27 PM 4/18/2018
//6:42 PM 4/18/2018

import java.util.Scanner;

public class Appstone_1_VowelsandConsonants {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input:");
		
		String s = sc.nextLine();
		
		countVandC(s);
		
		System.out.println("\nInput:");
		
		String s2 = sc.nextLine();
		
		countVandC(s2);
		
	}
	
	static void countVandC(String s){
		char v[] = {'A','E','I','O','U','a','e','i','o','u'};
		int vowels = 0;
		int cons = 0;
		
		//iterate the string
		for(int i=0;i<s.length();i++){
			boolean its_a_vowel = false;
			
			//skip if it's a space
			if(s.charAt(i) == ' '){
				//do nothing
			}else{
				//check if it's a vowel
				for(char c: v){//using enhanced loop
					if(c == s.charAt(i)){
						vowels++;
						its_a_vowel = true;
						break;
					}
				}
				
				//it's a consonant
				if(!its_a_vowel){
					cons++;
				}
			}		
		}
		
		System.out.printf("Number of Vowels:%d", vowels);
		System.out.printf("\nNumber of Cons:%d", cons);
	}
}

/*
 * Write a function that prints out the number of vowels and consonants in a
 * sentence
 */

// input: This is a sentence
//
// output:
// Number of vowels: 6
// Number of consonants: 9
