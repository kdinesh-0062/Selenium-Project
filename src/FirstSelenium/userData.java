package FirstSelenium;




public class userData{

static class CloneExample  implements Cloneable{
		
	
	String name;
	String email;
	
	public CloneExample(String name,String email) {
		this.email=email;
		this.name=name;
		
	
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}


	public static void main(String[] args) throws CloneNotSupportedException {
		
CloneExample cExample=new CloneExample("Dinesh", "dinesh@dsd.com")	;

CloneExample cl = (CloneExample) cExample.clone();

	
	cl.email="dinsdsd@dsd.com";
	cl.name="Dk";
	
	System.out.println(cExample.email+ " " + cExample.name);
	System.out.println(cl.email+ " " +cl.name);
	
	
	}}