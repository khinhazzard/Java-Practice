package time_problem; 

/*problem: convert the sample time string format("7:30 - 8:30")
 * convert get the hours and minute into integers. 
 * store values into sh,sm,eh,em(Starting hour,minute, Ending hour,minute)
 * ex result:
 * 
 * Starting time: 7:30
 * Ending Time: 8:30
 * 
 * sh = 7
 * sm = 30
 * eh = 8
 * em = 30
 * 
 */

public class time {

	public static void main(String args[]){
		
		timeMethods t1 = new timeMethods();
	//	System.out.println(t1.toIntegerTime("10:30"));
		//t1.getSTimeEtime("10:30-11:30");
		//10:30-11:30
		System.out.println(t1.checkTimeConflict("10:30-11:30", "9:30-11:30")); //same starting time
		System.out.println(t1.checkTimeConflict("10:30-11:30", "10:30-11:30"));//same ending time
		System.out.println(t1.checkTimeConflict("10:30-11:30", "9:30-10:30")); //no conflict
		System.out.println(t1.checkTimeConflict("10:30-11:30", "9:30-10:45")); //overriding
		System.out.println(t1.checkTimeConflict("10:30-12:00", "11:30-11:00")); //overriding 
		System.out.println(t1.checkTimeConflict("12:00-12:45", "12:30-13:00")); //overriding
		System.out.println(t1.checkTimeConflict("12:00-12:30", "12:30-13:00")); //overriding
	}
}
