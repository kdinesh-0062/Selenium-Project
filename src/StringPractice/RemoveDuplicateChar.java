package StringPractice;

public class RemoveDuplicateChar {
	public static void main(String[] args) {
        char[] input = {'a', 'b', 'c', 'a', 'b', 'd'};
        
        String resultS="";
        
        for(int i=0;i<input.length;i++) {
        	boolean isDuplicate=false;
        	for(int j=0;j<i;j++) {
        		if(input[i]==input[j]) {
        			isDuplicate=true;
        			break;
        		}
        	}
        	if(!isDuplicate) {
        		resultS+=input[i];
        	}
        }
        System.out.println(resultS);

	}

}
