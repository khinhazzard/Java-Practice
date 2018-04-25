import java.util.Scanner;
import java.util.concurrent.*;

public class executionTime {
	public static void main(String args[]) {

		long startTime = System.nanoTime();
		

		long endTime = System.nanoTime();
		long elapsedTime = endTime - startTime;
		TimeUnit.SECONDS.convert(elapsedTime, TimeUnit.NANOSECONDS);
		System.out.printf("Elapsed Time:%d nanosecs", elapsedTime);

	}
}
