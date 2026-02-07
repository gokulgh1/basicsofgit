package basicsofgit;
import java.util.*;
public class add{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();   
        System.out.println("Sum of the two numbers is: " + (a+b));
        sc.close();
    }
}