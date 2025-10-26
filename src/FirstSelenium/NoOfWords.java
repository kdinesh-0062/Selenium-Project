package FirstSelenium;

import java.util.HashMap;
import java.util.Map;

public class NoOfWords {  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		String name="i am done done done with java java java java";
		
		String[] str = name.split(" ");
		/*
		 * Map<String, Integer> mp= new HashMap<String, Integer>(); Integer count=1;
		 * for(int i=0;i<str.length;i++) {
		 * 
		 * if(!mp.containsKey(str[i])) { mp.put(str[i], count);} else {
		 * mp.put(str[i],mp.get(str[i])+1); }
		 * 
		 * } for(String x:mp.keySet()) {
		 * System.out.println("The count of word : "+x+" =  "+mp.get(x)); }
		 */
		
		Map<String, Integer> mp= new HashMap<String, Integer>();
		
		Integer count=1;
		for(int i=0;i<str.length;i++) {
			
			if(!mp.containsKey(str[i])) {
				
				mp.put(str[i], count);
				
				
			}
			
			else {
				mp.put(str[i],mp.get(str[i])+1);
			}
		}
	 for(String word: mp.keySet())	{
		 System.out.print(word+ " = "+mp.get(word)+ " ,");	 }
		
	}

}
