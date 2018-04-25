package time_problem;

public class timeMethods {
	private int hour,min;
	private String time, sT, eT;
	
	public void setTime(int h, int m){
		 hour = ((h >=0 && h<=24) ? h: 0); //h if true, else 0
	     min = ((m >=0 && m<=60) ? m: 0);
	}

	public String toIntegerTime(String time)//7:3(valid sample)
	{
		String sh="", //starting hour
			   sm=""; //starting min
		
		int max_char;
		max_char = time.length();

		String[] convert = new String[max_char];
		
		//store to convert
		int i=0;
		for(char c: time.toCharArray())
		{
			convert[i]= String.valueOf(c); //returns string value of char
				i++;	
		}
		
		//conversion
		int flag=0;
		for(String s: convert){
			if(flag == 1){//get min
				sm +=s;
			}
			if(flag ==0){//get hour
				if(s.equals(":") == false)
				{
					sh += s; 
				}
				else{
					flag = 1;
				}	
			}
		}
		
		hour = Integer.parseInt(sh);
		min = Integer.parseInt(sm);
		
		return String.format("hour:%d\nminute:%d", hour,min);
	}
	
	public void getSTimeEtime(String time){
		String st="",et="";
		int to;
		to = time.indexOf('-');
		st = time.substring(0, to);
		et = time.substring(to+1, time.length());
		sT = st;
		eT = et;
	}
	
	public String checkTimeConflict(String t1, String t2){
		//if(p2->shr < p->shr || (p2->shr == p->shr && p2->smin < p->smin) )
		int t1shr,t1sm, t1ehr, t1em;
		int t2shr,t2sm, t2ehr, t2em;
		int conflict = 0;
		
		getSTimeEtime(t1);
		toIntegerTime(sT);
		t1shr = hour;
		t1sm = min;
		toIntegerTime(eT);
		t1ehr = hour;
		t1em = min;
		
		getSTimeEtime(t2);
		toIntegerTime(sT);
		t2shr = hour;
		t2sm = min;
		toIntegerTime(eT);
		t2ehr = hour;
		t2em = min;
		System.out.printf("%d:%d - %d:%d(t1) - ",t1shr, t1sm, t1ehr, t1em);
		System.out.printf("%d:%d - %d:%d(t2) > ",t2shr, t2sm, t2ehr, t2em);
			
		if(t1shr == t2shr && t1sm == t2sm ){//same starting time
			return "conflict 0 ";			
		}
		else if(t1ehr == t2ehr) { //same ending time
			return "conflict 1";
		}
		else if(t1shr == t2ehr && t2em > t1sm || t2shr == t1ehr && t1em > t2sm) { //overriding
			return "conflict 2";
		}
		else if(t1shr > t2shr && t1shr < t2ehr || t2shr > t1shr && t2shr < t1ehr) { //overriding
			return "conflict 3";
		}
		else{
			return "no conflict";	
		}
		

		
		//System.out.printf("%d:%d - %d:%d, %d:%d-%d%:%d",t1shr,t1sm,t1ehr,t1em,t2shr,t2sm,t2ehr,t2em);
			
	}
}
