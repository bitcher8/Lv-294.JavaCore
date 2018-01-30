package lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L1HW1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.println("Please, entry radius of the circle");
		double pi =3.14;
		int radius = Integer.parseInt(br.readLine());
		double perimeter=2*pi*radius;
		double area = pi*radius*radius;
		System.out.println("perimeter of the circle is "+perimeter);
		System.out.println("area of the circle is "+ area);

	}

}
