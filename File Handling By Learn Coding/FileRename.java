import java.io.*;
public class FileRename {
    public static void main(String args[])
    {
        File f=new File("A:\\Java programs\\File Handling By Learn Coding\\renamed.txt");
        File r=new File("A:\\Java programs\\File Handling By Learn Coding\\newfile.txt");
        
        if(f.exists()){
            System.out.println(f.renameTo(r));
        }
        else{
            System.out.println("File doesn't exist..!");
        }
    }
    
}
