package FirstSelenium;

public class Arrays3DwithForEach {
	public static void main(String[] args) {
		int [][][] arr= {{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}};
		
		for(int[][] test:arr) {
			for(int[] test1:test) {
				for(int value:test1) {
					System.out.print(value + " ");
				}
				System.out.println();
			}
			
		}
	}

}
