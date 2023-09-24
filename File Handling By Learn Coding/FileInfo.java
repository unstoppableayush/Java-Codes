import java.io.*;
public class FileInfo {
    public static void main(String args[])throws IOException{
     
    File f=new File("A:\\Java programs\\File Handling By Learn Coding\\newfile.txt");

    if(f.exists())
    {
        System.out.println("File Name:"+f.getName());
        System.out.println("File Loaction:"+f.getAbsolutePath());
        System.out.println("File Writable:"+f.canWrite());
        System.out.println("File Readable:"+f.canRead());
        System.out.println("File Size:"+f.length());
        //System.out.println("File Removed:"+f.delete());

    }
    else
    {
       System.out.println("File doesn't Exist...");
    }

    }
}
