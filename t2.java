package p1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class t2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(
		new InputStreamReader(System.in));

	System.out.println("Give me radius pls:");
	double r = Integer.parseInt(br.readLine());
	double perimeter = Math.PI*2*r;
	double area = Math.PI * Math.pow(r, 2);
	System.out.println("perimeter " + perimeter);
	System.out.println("area " + area);
	
	}

}
