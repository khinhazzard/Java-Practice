package inheritance;

//inheritance: inheriting stuff from another class
//Extends: inherit everything from
//override: recreate methods
//only public methods can be inherited


public class inheritance
{
public static void main(String args[]){
  
    pizza pizzaObj = new pizza();
    burger burgerObj = new burger();
    
    burgerObj.eat();
    pizzaObj.eat();
    
  }
}
