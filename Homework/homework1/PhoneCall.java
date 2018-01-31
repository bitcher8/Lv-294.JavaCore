import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneCall {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Please, enter standard units per minute for c1");
        int c1 = Integer.parseInt(br.readLine());
        System.out.println("Please, enter standard units per minute for c2");
        int c2 = Integer.parseInt(br.readLine());
        System.out.println("Please, enter standard units per minute for c3");
        int c3 = Integer.parseInt(br.readLine());
        System.out.println("Talks continued ...");
        int t1 = Integer.parseInt(br.readLine());
        System.out.println("Talks continued ...");
        int t2 = Integer.parseInt(br.readLine());
        System.out.println("Talks continued ...");
        int t3 = Integer.parseInt(br.readLine());
        int pay1 = c1 * t1;
        int pay2 = c2 * t2;
        int pay3 = c3 * t3;
        int amountPay = pay1 + pay2 + pay3;
        System.out.println("First phone call will cost: " + pay1);
        System.out.println("Second phone call will cost: " + pay2);
        System.out.println("Third phone call will cost: " + pay3);
        System.out.println("Amount: " + amountPay);
    }
}

