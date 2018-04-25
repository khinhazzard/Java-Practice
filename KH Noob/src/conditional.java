import java.util.Scanner; 

public class conditional
{
     public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        
        System.out.print(age > 40 ? "You are really old" : "Don't worry, you're not that old");
       
    }
}
