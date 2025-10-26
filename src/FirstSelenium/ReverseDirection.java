package FirstSelenium;

import java.util.Set;

public class ReverseDirection {

	public static void main(String[] args) {
	String name="Apppale";
	char[] str = name.toLowerCase().toCharArray();
	
	//int count=0;
	for(int i=0;i<str.length;i++) {
		if(str[i]=='0' || str[i]==' ')  continue;
		for(int j=i+1;j<str.length;j++) {
			if(str[i]==str[j]) {
				System.out.print(str[i] + ", ");
				str[j]='0';
				//count++;
				break;
			}
		}
	}
	

	}}