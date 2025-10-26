package BubbleSor;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemovingDuplicateWithoutCollection {

	public static void main(String[] args) {
        int[] arr = {1, 3, 5, 3, 7, 9, 1, 5};

        
		
		  for(int i=0;i<arr.length;i++)  {
		   boolean isDuplicate=false; 
		  for(int j=0;j<i;j++) 
		  {
		   if(arr[i]==arr[j]) {
		    isDuplicate=true;
		    break;
		     } 
		     }
		  if(!isDuplicate) { 
		  System.out.print(arr[i]+ " "); 
		  } }
		 
       
        
        // Using Java 8 features
		/*
		 * List<Integer> list =
		 * Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());
		 * System.out.println(list);
		 */
	}
}
