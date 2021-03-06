package aGettingStarted_school;

//https://practice.geeksforgeeks.org/problems/surface-area-and-volume-of-cuboid/0/?ref=self

//5:41 PM 4/19/2018
//5:47 PM 4/19/2018

import java.util.Scanner;

public class GFG_23_CuboidSurfaceAreaVolume {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input:");
		int tc = sc.nextInt();
		
		while(tc-->0){
			//get length, width, height
			int l = sc.nextInt();
			int w = sc.nextInt();
			int h = sc.nextInt();
			
			//compute surface area and volume
			int sa = 2*(l*w + w*h + h*l);
			int vol = l*w*h;
			
			//display result
			System.out.printf("%d %d",sa,vol);
			
			if(tc>0)
			System.out.println();
		}
	}
}

// surface area formula: 2(lw + wh + hl)
// volume formula: l x w x h

/*
 * Write a program to calculate the total surface area and volume of cuboid.
 * 
 * Input:
 * 
 * The first line of the input contains T denoting the number of testcases. Each
 * of the next T lines contains three space separated positive integers L, B, H
 * denoting the length, width and height of cuboid respectively.
 * 
 * 
 * Output:
 * 
 * For each testcase, output two space separated integers denoting surface area
 * and volume of cuboid respectively.
 */

// Constraints:
//
// 1<=T<=100
// 1<=l,b,h<=1000
//
// Example:
//
// Input:
// 1
// 1 2 3
//
// Output:
// 22 6