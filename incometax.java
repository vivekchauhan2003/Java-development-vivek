import java.util.*;

public class incometax {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        // Write Your code here :
        System.err.print("Please enter your anual Income : ");
        int income = sc.nextInt();
        int Tax = 0;

        if (income < 500000) {
            System.out.println("Chla ja bsdk");
        } else if (income > 500000 && income < 1000000) {
            // System.out.println("Tax to pay : " + (Tax = ((2 * income)/10)));
            System.out.println("Tax to pay : " + (Tax = (int) (income * 0.2))); // type casting
        } else {
            System.out.println("Tax to pay : " + (Tax = ((3 * income) / 10)));

        }

        sc.close();
    }
}
