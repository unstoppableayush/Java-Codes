import java.util.*;
public class IndexNoInArray {
    public static void main(String args[]){
   
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of Array:");
        int size = sc.nextInt();
        int numbers[]=new int[size];

        System.out.print("Enter the values:");
        //input
        for(int i=0; i<size; i++ ){
            numbers[i]=sc.nextInt();
        }
        System.out.println("Enter the no. which you want to search:");
        int x=sc.nextInt();

        //output
        for(int i=0; i<numbers.length; i++){//numbers.length=size
            if(numbers[i]==x)
            {
                System.out.print("X is found Index:"+numbers[i]);
            }
        }
        sc.close();
    }
    
}
