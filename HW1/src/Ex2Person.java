import java.io.IOException;
import java.util.Scanner;

public class Ex2Person {
	public static void io() throws NumberFormatException, IOException {	
		System.out.println("What is your name?");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Where are you live, " + name + "?");
		String address = sc.nextLine();
		System.out.println("You are " + name + ", living in " + address);
	}

}
	