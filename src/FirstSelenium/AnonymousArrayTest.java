package FirstSelenium;

public class AnonymousArrayTest {
	
	
	static void sum(int [] no) {
		
		int total=0;
		for(int i:no) {
			total=total+i;
		}
		
		System.out.println(total);
	}
		
		
	public static void main(String[] args) {
		
		AnonymousArrayTest.sum(new int[] {1,2,4,5,6,7,8});
		
	}

}
