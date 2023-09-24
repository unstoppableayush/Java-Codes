import java.util.*;
public class Strings {
    public static void main(String args[]){
        //String Declaration

        String firstName = "Tony";
        String lastName="Stark";
        /*String fullName="Tony Stark";
        String sentence = "My name is Tony Stark."; */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name1=sc.nextLine();
        System.out.println("Your name is :"+ name1);
        System.out.println();

        //concatenation-Add two Strings
        System.out.println("CONCATENATION");
        String fulName = firstName + " " +lastName;
        System.out.println(fulName);
        
        System.out.println();
        System.out.println("Length of String:");
        System.out.print(fulName.length());
        


        System.out.println("\n");
        System.out.println("charAt\n");
        //chatAt-print the characters of string
        for(int i=0; i<fulName.length(); i++){
            System.out.println(fulName.charAt(i));
        }

        System.out.println("\n");
        //Compare-Comparinng two Strings
        System.out.println("COMPARE");
        String name2= "Tony";
        String name3= "Tony";

        //1 s1 > s2 : +ve value
        //2 s1 == s2 : 0
        //3 s1 <s2 : -ve value
        
        if(name2.compareTo(name3)==0){
            System.out.println("Strings are Equal");
        }else{
            System.out.println("Strings are not Equal");
        }

        System.out.println("\n");

       /* if(new String("Tony") == new String("Tony")){
            System.out.println("Strings are Equal");
        }else{
            System.out.println("Strings are not Equal");
        } */

        //subString
        System.out.println("SBUSTRING");

        String sentence = "My name is Tony";
        //substring(beg index , end index)
        String name4 = sentence.substring(11, sentence.length());
        String name5 = sentence.substring(11);
        String name6 = sentence.substring(0,11);
        System.out.println(name4);
        System.out.println(name5);
        System.out.println(name6);

        //Strings are Immutable

     sc.close();
    }
    
}
