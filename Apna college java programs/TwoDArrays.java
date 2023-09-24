import java.util.*;
public class TwoDArrays{
    public static void main(String args[])throws Exception{
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no. of rows:");
        int rows =sc.nextInt();
        System.out.print("Enter the no. of columns:");
        int cols = sc.nextInt();
     
         int numbers[][]=new int[rows][cols];

         //input
         //rows
         System.out.println("Enter the values of matrix row wise:");
         for(int i=0; i<cols ; i++){
             //columns
             for(int j=0; j<cols ; j++){
                 numbers[i][j]=sc.nextInt();
             }
         }
         System.out.println("Entered MAtrix");
         for(int i=0;i<rows;i++){
             for(int j=0;j<cols;j++){
                 System.out.print(numbers[i][j] +" ");
             }
             System.out.println();
         }
         sc.close();

    }
}