package finalVariables;


public class corn
{
    private int sum; //default value is 0
    private final int NUMBER; //CC: all caps means constant
    
    corn(int num){
    
        NUMBER = num;
    } 
    
    public void add(){
        sum += NUMBER;
    }
    
    public String toString(){
        
        return String.format("Sum = %d\n", sum);
    
        
    }
    
    
}
