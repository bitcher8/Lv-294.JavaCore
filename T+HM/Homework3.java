// package Homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		
		System.out.println("How much cost calls from first, second and third country? (per minute)");
	
		double c1 = Double.parseDouble(br.readLine());
		double c2 = Double.parseDouble(br.readLine()); 
		double c3 = Double.parseDouble(br.readLine());
		
		System.out.println("How long was continuing every talk?");
		
		double t1 = Double.parseDouble(br.readLine());
		double t2 = Double.parseDouble(br.readLine());
		double t3 = Double.parseDouble(br.readLine());
		
		double a = (c1 * t1) + (c2 * t2) + (c3 * t3);
		
		System.out.println("Talk with first country cost " + c1 * t1 + " units");
		System.out.println("Talk with second country cost " + c2 * t2 + " units");
		System.out.println("Talk with third country cost " + c3 * t3 + " units");
		System.out.println("All talks cost " + a + " units");
			
		}
	}

