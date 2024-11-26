package FirstSelenium;

public class TestP {
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,3,4};
	       // Set<Integer> s= new HashSet<>();
	        for(int i=0;i< a.length-1;i++){
	            for(int j=i+1;j<a.length;j++){
	                if(a[j]==a[i]){
	                    System.out.print(a[i]+"," );
	                }

	            }
	            //System.out.println(no);

	        }
	}

}
