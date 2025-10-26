package FirstSelenium;

import java.util.HashMap;
import java.util.Map;

public class try3 {
	public static void main(String[] args) {
		String name="This is an automation testing interview";
		
	    String name1=name.replaceAll("\\s", "");
	    char[] ch= name1.toLowerCase().toCharArray();
	    
	    for(int i=0;i<ch.length;i++) {
	    	for(int j=i+1;j<ch.length;j++) {
	    		if(ch[i]==ch[j]) {
	    			
	    		}
	    	}
	    	
	    }
	    
	    Map<Character,Integer> mp =new HashMap<Character, Integer>();
	    for(char c :ch) {
	    	if(mp.containsKey(c)) {
	    		mp.put(c, mp.get(c)+1);}
	    		
	    		else {
	    			mp.put(c, 1);
	    			
	    		}
	    }
	    	System.out.println(mp);
	    	}
	    }
	


