package enumeration;

//enumaration - constants that are also objects that never change 

public enum berries{
    tisha("cutie", "16"),
	daisy("hottie","17"),
	nemia("imbafuckinghot", "23"),
	jesery("cute and sexy", "14"),
	amir("sayang" , "19");
    
    private final String desc;
    private final String age;
    
    berries(String desc, String age){
        this.desc = desc;
        this.age = age;
    }
    
    public String getDesc(){
        return desc;
    }

    public String getAge(){
        return age;
    }

}
