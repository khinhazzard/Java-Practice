package staticVariables;


public class club
{
    private String firstname;
    private String lastname;
    
    private static int members =0;
    
    club(String fn, String ln){
    
        firstname = fn;
        lastname = ln;
        members++;
        System.out.printf("%s %s was added to the club, Members in the club: %d\n", 
                            firstname, lastname, members);
    }
    
    public String getFn(){
        return firstname;
    }
    
    
    public String getLn(){
        return lastname;
    }
    
    
    public static int getMem(){
        return members;
    }
  
}
