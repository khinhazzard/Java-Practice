package threads;

public class tuna {
	
	public static void main(String args[]){
		
		Thread t1 = new Thread(new Apple("one"));
		Thread t2 = new Thread(new Apple("two"));
		Thread t3 = new Thread(new Apple("three"));
		Thread t4 = new Thread(new Apple("four"));
		Thread t5 = new Thread(new Apple("five"));
		Thread t6 = new Thread(new Apple("six"));
		Thread t7 = new Thread(new Apple("seven"));
		Thread t8 = new Thread(new Apple("eight"));
		Thread t9 = new Thread(new Apple("nine"));
		Thread t10 = new Thread(new Apple("ten"));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		
	}

}
