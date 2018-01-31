// package Tasks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
	public static void main(String [] args) throws IOException { 
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		System.out.println("Hello. Write a value for a");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Now write a value for b");
		int b = Integer.parseInt(br.readLine());
		
		int i = a + b;
		int s = a - b;
		
		System.out.println("a + b = " + i);
		System.out.println("a * b = " + a * b);
		System.out.println("a - b = " + s);
		System.out.println("a / b = " + a / b);
	}	
}
		
		