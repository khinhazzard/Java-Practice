package aGettingStarted_school;

//https://practice.geeksforgeeks.org/problems/the-penalty-shootout/0/?ref=self
//started at 2:33 PM 4/12/2018
//finished at 3:28 PM 4/12/2018
//Execution Time:0.15

import java.util.Scanner;

public class GFG_6_ThePenaltyShootout {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		//testcase
		System.out.println("Input");
		int tc = sc.nextInt();
		
		while(tc-->0){
			
			//ask for a String that contains only(0,1 and 2)
			String scores = sc.next();
			
			//convert string to charArray
			char c_scores[] = scores.toCharArray();
			
			//initialize
			boolean penalty=false;
			int goal = 0;
			
			//enhanced loop
			for(int c: c_scores){
				
				//if no penalty look only for penalty(2)
				if(!penalty){
					if(c=='2'){
						penalty = true;
					}		
				}else{//its a penalty check if succeeding char is a goal
					if(c=='1'){
						goal++;
						penalty = false;
					}else if(c=='2'){
						penalty = true;
					}else{
						penalty = false;
					}
				}
			}
			
			//display total goals
			System.out.print(goal);
			
			if(tc>0)
			System.out.println();
		}
	}
}

/*
 * Ishaan loves playing football. He is a penalty master as he practices a lot.
 * Now during a match he wants to know how many goals does he score during a
 * penalty. Since he wants to focus on the match, he asks you to count the goals
 * for him. You are given a string which consists of 3 different characters :
 * "0" stands for "no goal". "1" stands for "goal". "2" stands for a foul which
 * gives Ishaan a penalty. Note : You need to count only those goals which are
 * scored on a penalty.
 * 
 * Input : First line of input contains a single integer T denoting the number
 * of test cases. The only line of each test case contains a string S.
 * 
 * Output : For each test case, print the required answer in a new line.
 */