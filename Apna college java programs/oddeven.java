import java.util.*;;
public class oddeven {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter number:");
         int x=sc.nextInt();

         if(x%2==0)
         {
             System.out.println("Given no. is Even");
         }
         else{
             System.out.println("Given no. is Odd");
         }
         sc.close();

    }
}
