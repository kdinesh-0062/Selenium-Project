package StringPractice;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String[] words = {"java", "selenium", "java", "api", "testng", "selenium"};

        
        String resultString="";
        
        for(int i=0;i<words.length;i++) {
        	boolean isDup=false;
        	for(int j=0;j<i;j++) {
        		if(words[i]==words[j]) {
        			isDup=true;
        			break;
        			
        		}
        	}
        	
        	if(!isDup) {
        		resultString+=words[i]+ " , ";
        		
        	}
        }
        
        System.out.println(resultString);

	}

}
