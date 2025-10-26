package FirstSelenium;


public class try2 {
	public static void main(String[] args) {
		

String name ="Testing WorlTd";
  
char[] ch=name.toLowerCase().toCharArray();

for(int i=0;i<ch.length;i++) {
	if(ch[i]==' ' || ch[i]==' ') continue;
	for(int j=i+1;j<ch.length;j++) {
		if(ch[i]==ch[j]) {
			System.out.println(ch[i]);
			ch[j]='0';
			break;
		}
		
	}
}

	}

}
