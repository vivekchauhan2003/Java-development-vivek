import java.util.*;
public class reverseofn {
    public static void main (String arg[]) {
        Scanner sc = new Scanner(System.in);      
        // Write Your code here :
        // System.out.print("Enter the number to reverse = ");
        // int num = sc.nextInt();

        // while(num > 0)
        // {
        //     int lastdigit = num%10;
        //     System.out.print(lastdigit+" ");
        //     num/=10; 
        // }

        int n = 1234567;
        System.out.println("real number is = "+n);
        int rev = 0;
        while(n>0)
        {
            int lastdigit = n%10;
            rev = (rev*10)+lastdigit;
            n/=10;
        }
        n = rev;
        System.out.println("reversed number is = "+n);


           
        sc.close(); 
    }
}
