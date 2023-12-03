import java.util.*;
public class calculator{
    public static void main (String arg[]) {
        Scanner sc = new Scanner(System.in);      
        // Write Your code here :
       System.out.println("**************** Calculaot *****************");
       System.out.print("Enter First number = ");
       int num1 = sc.nextInt(); 
       System.out.print("Enter Second number = ");
       int num2 = sc.nextInt(); 
       System.out.println("Press 1 = Add");
       System.out.println("Press 2 = Sub");
       System.out.println("Press 3 = Mul");
       System.out.println("Press 4 = Div");
       System.out.println("Press 5 = Mod");
       int select = sc.nextInt();

       switch (select)
       {
        case 1: 
        {
            System.out.println(num1+num2);
            break;
        }
        case 2: 
        {
            System.out.println(num1-num2);
        }
        break;
        case 3: 
        {
            System.out.println(num1*num2);
        }
        break;
        case 4: 
        {
            System.out.println(num1/num2);
        }
        break;
        case 5: 
        {
            System.out.println(num1%num2);
        }
        break;

        default: 
        { 
            System.out.println("Baba ki daya se Lund Lele Mera !");
        }
       }
              
        sc.close(); 
    }
}
