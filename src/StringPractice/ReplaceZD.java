package StringPractice;

public class ReplaceZD {
    public static void main(String[] args) {
        String input = "ZD34F SDZD ZDZD XZD1234";
       String[] words = input.split(" ");
       
       StringBuilder sb=new StringBuilder();
       
       for(String word:words) {
    	   
    	   if(word.contains("XZD")){
    		   sb.append(word);
    	   }
    	   else {
                    sb.append(word.replace("ZD", "KD")).append(" ");				
			}
		}
       
       System.out.println(sb.toString().trim());
       }
    }

