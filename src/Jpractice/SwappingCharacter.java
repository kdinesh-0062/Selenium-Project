package Jpractice;

public class SwappingCharacter {


    public static void main(String[] args){

       String name = "Dinesh";
      
        StringBuffer sB=new StringBuffer();
        char c1='e';
        char c2='i';
        
for(int i=0;i<sB.length();i++) { 
	if(sB.charAt(i)==c1) {
		sB.setCharAt(i, c2);
	}
	
	else if (sB.charAt(i)==c2) {
		sB.setCharAt(i, c1);
		
	}
	
	
    }
System.out.println(sB);

}
}


