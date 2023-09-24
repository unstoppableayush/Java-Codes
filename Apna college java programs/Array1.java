import java.util.*;
 
public class Array1 {
   public static void main(String args[]) throws Exception{
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter the no. of Names:");
      int size = sc.nextInt();
      
      String names[] = new String[size];
 
      //input
      System.out.println("Enter Names;");
      for(int i=0; i<size; i++) {
          names[i] = sc.next();
      }
     
      //output
      System.out.println("Entered Names:");
       for(int i=0; i<names.length; i++) {
           System.out.println("name " + (i+1) +" is : " + names[i]);
       }
      sc.close();
   }
}
