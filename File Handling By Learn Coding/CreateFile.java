import java.io.*;
public class CreateFile{
  
    public static void main(String args[]) throws IOException{
    File f=new File("A:\\Java programs\\File Handling By Learn Coding\\newfile.txt");
    if(f.createNewFile())
    {
             System.out.println("File is Successfully Created..!");
    }
    else
     {
              System.out.println("File Already Exist..");
    }
    /*try{
        
   
        if(f.createNewFile())
        {
             System.out.println("File is Successfully Created..!");
        }
        else
        {
              System.out.println("File Already Exist..");
        }
      }
    catch(IOException i)
    {
       System.out.println("Exception Handled..!");
    }
    */
  }
}
