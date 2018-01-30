import java.io.*;
public class MyClass {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("First Task");
		
		System.out.println("Enter the radius");
		double radius = Double.parseDouble(reader.readLine());
		System.out.println("Perimeter:" + (2*radius*Math.PI));
		System.out.println("Area:" + (Math.PI *Math.pow(radius, 2)));
		System.out.println();
		
		
		System.out.println("Second Task");
		
		System.out.println("What's your name?");
		String name = reader.readLine();
		System.out.println("Where do you live, " + name + "?");
		String address = reader.readLine();
		System.out.println(name + "\n" + address);
		
		
		System.out.println("Third Task");
		
		System.out.println("Enter price of phonecall from the first country");
        double c1 = Double.parseDouble(reader.readLine());
        System.out.println("Enter the time how much the first phonecall takes");
	    double t1 = Double.parseDouble(reader.readLine());
	    
	    System.out.println("Enter price of phonecall from the second country");
        double c2 = Double.parseDouble(reader.readLine());
        System.out.println("Enter the time how much the second phonecall takes");
	    double t2 = Double.parseDouble(reader.readLine());
	    
	    System.out.println("Enter price of phonecall from the third country");
        double c3 = Double.parseDouble(reader.readLine());
        System.out.println("Enter the time how much the third phonecall takes");
	    double t3 = Double.parseDouble(reader.readLine());
	    
	    double ct1 = c1*t1;
	    double ct2 = c2*t2;
	    double ct3 = c3*t3;
	    System.out.println("Computer will count for first call " + ct1);
	    System.out.println("Computer will count for first call " + ct2);
	    System.out.println("Computer will count for first call " + ct3);
	    System.out.println("Together: "+ (ct1+ct2+ct3));
	    reader.close();
	}

}
