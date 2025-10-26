package BubbleSor;

public class FindMissingNum {
	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,6,7,8,9};
		
		/*
		 * //Using for loop int expected_num=a.length+1; int
		 * total_sum=expected_num*(expected_num+1)/2;
		 * 
		 * System.out.println(total_sum);
		 * 
		 * int sum=0; for(int i=0;i<a.length;i++) { sum=sum+a[i]; }
		 * System.out.println("Missing number: "+ (total_sum-sum));
		 */
		
		
		//Using ForEach Loop
		
		/*
		 * int expected_num=a.length+1; 
		 * int total_sum=expected_num*(expected_num+1)/2;
		 * int sum=0;
		 * 
		 * for(int num:a) { sum+=num; }
		 * 
		 * int missing_number=total_sum-sum;
		 *  System.out.println(missing_number);
		 */
		
		
		
		
		int expected_num=a.length+1;
		int total_sum=expected_num*(expected_num+1)/2;
		//System.out.println(total_sum);
		
		int sum=0;
		
		for(int num:a) {
			sum+=num;
					
		}
		System.out.println(total_sum-sum);
		
	}

}
