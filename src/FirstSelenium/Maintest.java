package FirstSelenium;


class Students {
	int rollno;
	String name;
	Students(int rollno1,String name1) {
		rollno=rollno1;
		name=name1;
		
		// TODO Auto-generated constructor stub
	}
	void show() {
		System.out.println("rollno : "+rollno+" & Name:"+name);
	}

}

public class Maintest{
	public static void main(String[] args) {
		Students s1=new Students(101, "Dinesh");
		s1.show();
	
}}