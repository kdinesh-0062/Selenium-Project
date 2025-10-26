package FirstSelenium;

import java.util.HashSet;
import java.util.Set;

public class TestP {
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,4,3,4,4,4,4,4,4,4,4,4,4,4,4,4,4,3,3,3,3,3,3,2,2,2,2,2,2};
	       Set<Integer> s= new HashSet<Integer>();
	        for(int i=0;i< a.length;i++){
	        	//if(a[i]==0 || a[i]==0) continue;
	            for(int j=i+1;j<a.length;j++){
	                if(a[i]==a[j]){
	                    s.add(a[i]);
	     
	                }

	            }
	            //System.out.println();

	        }
	        System.out.println(s);
	}

}
