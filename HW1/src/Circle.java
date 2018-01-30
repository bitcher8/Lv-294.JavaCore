import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle {
	public static void meth() throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(
	new InputStreamReader(System.in));

System.out.println("How are you?");
String answer = br.readLine();
System.out.println("You are" + answer);  

}	

}