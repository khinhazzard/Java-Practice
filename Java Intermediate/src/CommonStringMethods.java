public class CommonStringMethods {
	
	public static void main(String args[]){
		
		String[] words = {"funk", "chunk", "fury", "baconator"};
		
		//startsWith 
		for(String w: words){
			if(w.startsWith("fu")){
				System.out.println(w +" starts with fu");
			}
		}
		
		//endsWith 
		for(String w: words){
			if(w.endsWith("unk")){
				System.out.println(w +" ends with unk");
			}
		}
		
		String s = "khinhazzardkhinhazzard";
		System.out.println(s.indexOf('n'));
	    System.out.println(s.indexOf('n', 5)); //5 is the starting point in the array
	    System.out.println(s.indexOf('x')); // returns -1 which indicates false
	    System.out.println(s.indexOf("haz"));
	    System.out.println(s.indexOf("haz", 12));
	    
	    String a = "Bacon ";
	    String b = "         monster                ";
	    
	    System.out.println(a + b);
	    System.out.println(a.concat(b.trim()));
	    System.out.println(a.replace('B', 'F'));
	    System.out.println(b.toUpperCase());	    
	    
	}

}
