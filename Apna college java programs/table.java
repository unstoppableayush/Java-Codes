import java.util.*;
public class table {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. to print it's table:");
        int n=sc.nextInt();
        int tab=0;
        for(int i=1;i<=10;i++)
        {
            tab=n*i;
            System.out.println(tab);
        }
        sc.close();


    }
}
