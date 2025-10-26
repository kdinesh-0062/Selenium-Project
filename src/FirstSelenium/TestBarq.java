package FirstSelenium;

public class TestBarq {

	public static void main(String[] args) {
		
		
int [] a= {2,7,4,5,6,7};

int target=9;

for(int i=0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
		if(a[i]+a[j]==target) {
			System.out.println("Output :" + i + " ," + j);
			return;
		}
	}
}

System.out.println("No paire found");
	}

}
