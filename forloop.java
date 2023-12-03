import java.util.*;
public class forloop {
    public static void main (String arg[]) {
        Scanner sc = new Scanner(System.in);      
        // Write Your code here :
        // hello world 10 times:
        // for(int i=1; i<=10; i++)
        // {
        //     System.out.println("Hello World "+i);
        // }
       
        // Star pattern :
        // *
        // * *
        // * * *
        // * * * *
        for (int i = 1; i <=4; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
       
        
        sc.close(); 
    }
}

