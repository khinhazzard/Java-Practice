import java.util.Scanner;

//simple average calculating program
 
public class average
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int total = 0,
            grade,
            counter =0,
            average;
        
        System.out.println("Enter your grades:");
        while(counter < 10)
        {
           do{
            System.out.printf("Grade %d: ", counter+1);
            grade = input.nextInt();
            }while(grade == 0 || grade >100 || grade <0);
            total += grade;
            counter++;
        }
        
        average = total / 10;
        System.out.println("Your average is " + average); 
        
        
        System.out.print(average > 75 ?"You have passed!" : "You are screwed!");
    }
}   
