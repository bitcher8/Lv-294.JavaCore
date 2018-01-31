// package Homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Write the radius of a circle");
		double r = Double.parseDouble(br.readLine());
		
		double p = 2 * (3.1415 * r);
		double a = 3.1415 * (r * r);
		
		System.out.println("The perimeter of a circle is " + p);
		System.out.println("The area of a circle is " + a);
	}
}
