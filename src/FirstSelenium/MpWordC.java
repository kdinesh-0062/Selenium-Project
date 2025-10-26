package FirstSelenium;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.devtools.v120.css.model.Value;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class MpWordC {
	public static void main(String[] args) {
		String name="dinesh rajesh dinesh mukesh";
		
		Map<String, Integer> mp= new HashMap<String, Integer>();
		
		
		for(String word:name.split(" ")) {
			//if(mp.containsKey(word)) {
			
			mp.put(word, mp.getOrDefault(word, 0)+1);
		}
		System.out.println(mp);
		
		
		  for(Map.Entry<String, Integer> entry: mp.entrySet()){ if(entry.getValue()>1)
		  { System.out.println(entry.getKey()+ " :" +entry.getValue()); } }
		 
	
	

}}
