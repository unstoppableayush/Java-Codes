import java.util.*;
public class greaterlesser {
    public static void main(String[] args){

    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first no.:");
    int a=sc.nextInt();
    System.out.println("Enter the first no.:");
    int b=sc.nextInt();

    if(a==b){
        System.out.println("Equal");
    }
    else if(a>b)
    {
            System.out.println("a is Greater");
        }
    else
    {
            System.out.println("a is Lesser");
     }
     sc.close();  
   }
}
