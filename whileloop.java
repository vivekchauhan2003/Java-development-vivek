import java.util.*;
public class whileloop{
    public static void main (String arg[]) {
        Scanner sc = new Scanner(System.in);      
        // Write Your code here :
        // int a = 1;
        // while(a <= 100)
        // {
        //     System.out.println("Hello Woorld" + a);
        //     a++; // ++a; a+=1; a = a+1;
        // }
       
        // Printing Table of 2:
        // int a = 1;
        
        // while(a<=10)
        // {
        //     int b = 2*a;
        //     System.out.println("2 x " +a+" = " + b);
        //     a++;
        // }

        // Sum of n natural number :
        System.out.print("Enter value of n : ");
        int a = sc.nextInt();
        int Sum = 0;
        while(1 <= a)
        {
            Sum = Sum + a;
            a = a+1;
        }
        System.out.println("The sum of n natural number is = "+ Sum);
               
        sc.close(); 
    }
}
