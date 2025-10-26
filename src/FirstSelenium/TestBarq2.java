package FirstSelenium;



class Parent{
	
	public void test() {
		System.out.println("Parent");
	}
}

class Child extends Parent{
	
	public void test() {
		System.out.println("Child");
	}
}

public class TestBarq2 {

	public static void main(String[] args) {
		
		Child child=new Child();
		child.test();
		
		
		

	}

}
