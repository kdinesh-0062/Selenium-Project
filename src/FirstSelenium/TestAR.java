package FirstSelenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

	
	public class TestAR {
		public static void main(String[] args) {
			
			//int [] a= {3,6,7};
			//int [] b= {8,9,10,13};
			
			
			List<Integer> l1=new ArrayList<Integer>(Arrays.asList(3,6,7));
			List<Integer> l2=new ArrayList<Integer>(Arrays.asList(8,9,10));
			
			l1.addAll(l2);
			
			System.out.println(l1);
			
		}

	}



