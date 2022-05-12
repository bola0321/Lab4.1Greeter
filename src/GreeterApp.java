import java.util.Scanner;

public class GreeterApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Choose a greeting: ");
		String userGreet = scnr.nextLine();
		System.out.print("Enter your name: ");
		String userName = scnr.nextLine();
		System.out.print("How much volume do you want to add? (0-10): ");
		int userVolume = scnr.nextInt();
		
		Greeter greeter1 = new Greeter (userGreet);
		System.out.println(greeter1.greet(userName));
		
		SimonGreeter simonGreet1 = new SimonGreeter(userGreet);
		System.out.println(simonGreet1.greet(userName));
		
		LoudGreeter loudGreet1 = new LoudGreeter(userGreet);
		
		for (int i = 0; i < userVolume; i++) {
			loudGreet1.addVolume();
		}
		System.out.println(loudGreet1.greet(userName));
		
		HtmlGreeter htmlGreet = new HtmlGreeter(userGreet);
		System.out.println(htmlGreet.greet(userName));
		
		scnr.close();
	}
	

}
