package aGettingStarted_school;

//https://practice.geeksforgeeks.org/problems/area-of-rectange-right-angled-triangle-and-circle/0

//5:01 PM 4/16/2018
//5:27 PM 4/16/2018
//Execution Time:0.15


import java.util.Scanner;

public class GFG_17_AreaOfShapes {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input");

		int tc = sc.nextInt();

		while (tc-- > 0) {
		
			//Rectangle - length, breadth / Triangle - base, perpendicular / Circle - radius
			int r_length = sc.nextInt();
			int r_breadth = sc.nextInt();
			int t_base = sc.nextInt();
			int t_perp = sc.nextInt();
			int c_rad = sc.nextInt();
			
			System.out.printf("%d %d %d",area_of_rect(r_length, r_breadth), 
					area_of_triangle(t_base,t_perp),area_of_circle(c_rad));
			
			if (tc > 0)
				System.out.println();
		}
	}
	
	//rectangle
	static int area_of_rect(int r_length, int r_breadth){
		
		double area = r_length*r_breadth;
		
		return (int)Math.floor(area);
	}
	
	//right angled triangle
	static int area_of_triangle(int base, int perp){
		
		double area = (0.5)*base*perp;
		return (int)Math.floor(area);
	}
	
	//circle
	static int area_of_circle(int rad){
		
		double pi = 3.14;
		double area = (pi)*Math.pow(rad,2);

		return (int)Math.floor(area);
	}
}

/*
 * Calculate the area of rectangle, right angled triangle and circle.
 * 
 * Input:
 * 
 * The first line of the input contains T denoting the number of testcases. Then
 * follows the description of testcase. Each testcase contains 5 space separated
 * positive integers denoting the length of rectangle, width of rectangle, base
 * of right angled triangle, perpendicular of right angled triangle and radius
 * of circle respectively.
 * 
 * Output:
 * 
 * For each testcase, output a single line containing 3 space separated integers
 * denoting the area of rectangle, area of right angled triangle, and area of
 * circle respectively.
 * 
 * Note: We need to print the floor values of the areas. Also take value of pi =
 * 3.14
 */