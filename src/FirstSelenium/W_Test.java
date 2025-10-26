package FirstSelenium;

import java.util.HashSet;
import java.util.Set;

public class W_Test {
	public static void main(String[] args) {
		
		
		int [] a= {1,2,2,1};
		int [] b= {2,2};
		
		Set<Integer> set = new HashSet<Integer>();
		for(int num:a) {
			set.add(num);
		}
		
		Set<Integer> result=new HashSet<Integer>();
		for(int num:b) {
			if(set.contains(num)) {
				result.add(num);
			}
		}
		
		System.out.println(result);
	}

}
