package staticVariables;

//static variables: variables for all objects 
public class apple
{
     public static void main(String args[]){
        
         club member1 = new club("Megan","Fox");
         club member2 = new club("Miranda","Kerr"); 
         club member3 = new club("Taylor","Swift");
         
         //static methods can be called by objects
         System.out.println("\n"+member1.getFn());
         System.out.println(member1.getLn());
         System.out.println(member1.getMem());
         
         System.out.println("\n"+member2.getFn());
         System.out.println(member2.getLn());
         System.out.println(member2.getMem());
         
         System.out.println("\n"+member3.getFn());
         System.out.println(member3.getLn());
         System.out.println(member3.getMem());
         
         //static methods can also be used by the class
         System.out.println();
         System.out.println(club.getMem());
         
        }
}
