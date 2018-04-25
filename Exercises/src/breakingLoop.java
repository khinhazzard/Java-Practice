public class breakingLoop {
 
   public static void main(String[] args) {
 
     int count = 0; 
     loop_one:
     for (int k=5;k < 100;k++)
     {
       for (int j=3; j < 100; j++)
       {
         if (j % 2 == 0)
         {
           break;
         }
         if (k == 67)
         {
           break loop_one;
         }
         count ++;
       }
     }
     System.out.println(count);
   }
 }
 
 
 