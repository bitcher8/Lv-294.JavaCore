import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1Circle {
	public static void perimeter() throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(
	new InputStreamReader(System.in));

System.out.println("Please, enter the radius of flower bed, shaped like circle:");
double radius = Double.parseDouble(br.readLine());
double perimeter = 6.283 * radius;
double area = 3.1415 * radius * radius;

System.out.println("Perimeter is " + perimeter);
System.out.println("Area is " + area);

//Double.parseDouble(currentBalanceStr.replaceAll(" ","."));

//String answer = br.readLine();
//System.out.println("You are" + answer);  

}	

}