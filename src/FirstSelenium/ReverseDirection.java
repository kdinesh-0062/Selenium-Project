package FirstSelenium;

public class ReverseDirection {

	public static void main(String[] args) {
	String name="Apple";
	char[] str = name.toCharArray();
	//int count=0;
	for(int i=0;i<str.length;i++) {
		for(int j=i+1;j<str.length;j++) {
			if(str[i]==str[j]) {
				System.out.println(str[i]);
				//count++;
				//break;
			}
		}
	}
	

	}}