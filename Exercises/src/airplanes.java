/*  ThE airforce has asked you to write a program to label supersonic aircraft as military or civilian. 
 * Your program is to be given the planes observed speed and km/h and its estimated length in meters. 
 * 
    For planes traveling in excess of 1100 km/h, you will be traveling at slower speeds you will label
     those longer than 52 meters "civilian" and shorter aircraft as "military". For planes traveling at slower speeds,
      you will issue an aircraft type "unknown message".
    */
import java.util.Scanner;

public class airplanes {
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		int speed,length;
		String[] aircraft = {"plane1","plane2","plane3"};
		
		for(String a: aircraft){
			System.out.printf("\nEnter Info for %s:\n",a);
			System.out.print("Speed in km/h->");
			speed = input.nextInt();
			System.out.print("Estimated length travelled in meters -> ");
			length = input.nextInt();
			
			if(speed > 1100){
				if(length > 52 ){
					System.out.printf("%s - Civilian\n", a);
				}
				else
					System.out.printf("%s - Military\n", a);			
			}
			else
				System.out.printf("%s - Unknown message\n",a);
		}
	}
}
