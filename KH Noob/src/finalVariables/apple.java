package finalVariables;

public class apple
{
     public static void main(String args[]){
            
            corn cornObj = new corn(10);
            
            for(int i=0; i<5;i++){
                cornObj.add();
                System.out.printf("%s",cornObj);
            }
        }
}