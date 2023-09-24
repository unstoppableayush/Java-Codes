import java.io.*;
public class WriteInFile {
    public static void main(String args[]){
    
    try
    {
    FileWriter f=new FileWriter("A:\\Java programs\\File Handling By Learn Coding\\newfile.txt");
      try{
          f.write("Java is the best programming lang..!");
      }
      finally{
          f.close();
      }
     System.out.println("Succesfully Data wrote in File");

    }
    catch(IOException i)
    {
        System.out.println(i);
    }  
    }
}
