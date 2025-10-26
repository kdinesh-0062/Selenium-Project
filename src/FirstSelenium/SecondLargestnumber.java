package FirstSelenium;

public class SecondLargestnumber {
	public static void main(String[] args) {
		
/*		int [] a= {1,3,10,30,40,50,60};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
					
				}
			}
		
			 * if(i==2) {break;}
			 	}
		System.out.println(a[0]);
	}

}
*/
		
		int [] a= {30,20,10,40,50,60};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println(a[1]);
		
		/*
		 * for(int i=0;i<a.length;i++) { System.out.println(a[i]); }
		 */
		}

}

