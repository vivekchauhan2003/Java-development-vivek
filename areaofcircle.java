import java.util.*;
public class areaofcircle {
    public static void main (String arg[]) {
        Scanner sc = new Scanner(System.in);
        // String input = sc.next();
        
        // Write Your code here :
        System.out.print("Enter your radius : ");
        float radius = sc.nextFloat();
        float area = 3.14f * radius * radius;
        System.out.print("Your area is : ");
        System.out.println(area);
        sc.close();
    }
}

