package FirstSelenium;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDuplicateInteger {
	public static void main(String[] args) {
		int [] a= {2,2,2,3,4,5,6,7,7,7,7,6,8,9};
	Map<Integer, Integer> hm= new HashMap<Integer, Integer>();
	for(int no:a) {
		Integer count=hm.get(no);
		if(count==null) {
			hm.put(no, 1);
		}
		else {
			count=count+1;
			hm.put(no, count);
		}
				
			
			
		}
	
	System.out.print("Duplicate value are ");
	Set<Map.Entry<Integer, Integer>> set=hm.entrySet();
	for(Map.Entry<Integer, Integer> me:set) {
		
		if(me.getValue()>1) {
			System.out.print( me.getKey() + " ");
		}
	}
	
		}
	}


