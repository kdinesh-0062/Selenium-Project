package FirstSelenium;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueParticipants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		HashSet<String> participant=new HashSet<String>();
		System.out.println("Enter the participants name: " );

		while(true) {
			
			String input = scanner.nextLine();
			if(input.equalsIgnoreCase("done")) {
				break;
			}
			participant.add(input);
		}
scanner.close();
System.out.println("Unique name");
for(String participants:participant) {
	System.out.println(participants);
}
	}

}
