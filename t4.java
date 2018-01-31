package p1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class t4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
			System.out.println("Give me c1, c2, c3, t1,t2,t3 pls");
			int c1 = Integer.parseInt(br.readLine());
			int c2 = Integer.parseInt(br.readLine());
			int c3 = Integer.parseInt(br.readLine());
			int t1 = Integer.parseInt(br.readLine());
			int t2 = Integer.parseInt(br.readLine());
			int t3 = Integer.parseInt(br.readLine());
			int count1 = c1 * t1;
			int count2 = c2 * t2;
			int count3 = c3 * t3;
			int total = count1 + count2 + count3;
			System.out.println("summary calls in country 1 is " + count1);
			System.out.println("summary calls in country 2 is " + count2);
			System.out.println("summary calls in country 3 is " + count3);
			System.out.println("summary calls in all country is " + total);

			

	}

}
