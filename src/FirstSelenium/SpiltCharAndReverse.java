package FirstSelenium;

public class SpiltCharAndReverse {
    public static void main(String[] args) {
    	String str = "ABCXYZ";
		  
        int middle = str.length() / 2;
        
        StringBuilder result = new StringBuilder();

       
        for (int i = str.length() - 1; i >= middle; i--) 
        {
            result.append(str.charAt(i));
        }

        
        result.append(str.substring(0, middle));
        
        System.out.println("Output: " + result);

}
}

