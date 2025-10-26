package BubbleSor;

public class TestOnlineEx {
	public static void main(String[] args) {
		String name="Dinesh is in Banglore, banglore is good banglorebanglorebanglore";
		
		String test = name.toLowerCase();
		String target="banglore";
		int count=0;
		
		for(int i=0;i<=test.length()-target.length();i++) {
			if(test.substring(i,i+target.length()).equals(target)) {
				count++;
			}
		}
		
		System.out.println(count);
		
		
		
		
	}}
		
			//DIfferen between List and Set
			//How we can maintain insertion order using set; LinkedHashset and for Map : LinkedHashMap
			//What is sadow dom
			//Decendent
			//Sibling
			//Parent:
			//Ansestor
			//Map iterator
	