import java.util.*;
public class Sum {
        public static int calculateSum(int a,int b){
            int sum=a+b;
            return sum;

        }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter First No.=");
        int a =sc.nextInt();
        System.out.print("Enter Second No.=");
        int b=sc.nextInt();

        int sum=calculateSum(a,b);
        System.out.println("Sum of 2 numbers is:"+sum);
        sc.close();
    }

}
