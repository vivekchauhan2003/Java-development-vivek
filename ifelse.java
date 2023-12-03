import java.util.*;

public class ifelse {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        // Write Your code here :

        // // find larger of two numbers
        // int num1 = 10;
        // int num2 = 20;

        // if (num1 > num2) {
        //     System.out.println("num1 is larger : " + num1);
        // } else {
        //     System.out.println("num2 is larger : " + num2);
        // }

        // odd and even
        System.out.print("please enter a number to check : ");
        int num = sc.nextInt();

        if(num%2 == 0)
        {
            System.out.println("Even");
        }
        else
        {
            System.err.println("Odd");
        }


        sc.close();
    }
}
