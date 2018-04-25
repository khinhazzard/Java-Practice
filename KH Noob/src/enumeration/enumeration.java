package enumeration;

//enumaration - constants that are also objects that never change 
//EnumSet Range

import java.util.EnumSet; //class 

public class enumeration{
 
 public static void main(String args[]){
    
     for(berries chick: berries.values())  //values static array method for enum
         System.out.printf("%s\t%s\t%s\n", chick, chick.getDesc(), chick.getAge());
         
     System.out.println("\n\nResult of the EnumRange");
     
                        //EnumSet.range method in Enumset
     for(berries chick: EnumSet.range(berries.daisy,berries.jesery)) 
         System.out.printf("%s\t%s\t%s\n", chick, chick.getDesc(), chick.getAge());
 }

}
