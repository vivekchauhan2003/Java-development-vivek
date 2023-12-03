import java.util.*;

public class sumofAandB {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        // Write Your code here :
        System.out.println("Enter Numner 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Numner 2 : ");
        int num2 = sc.nextInt();

        // System.out.print("THE SUM IS : ", (num1 + num2));
        System.out.print("The Sum is :");
        System.out.println(num1 + num2);
        sc.close();
    }
}
