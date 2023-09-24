import java.util.*;
public class Product {
    public static int calculateProduct(int a,int b){
        return a*b;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First no.=");
        int a=sc.nextInt();
        System.out.print("Enter Second no.=");
        int b=sc.nextInt();

        System.out.println("Product of 2 numbers is:"+calculateProduct(a,b));
        sc.close();
    }
}
