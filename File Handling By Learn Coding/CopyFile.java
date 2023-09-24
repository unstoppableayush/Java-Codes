import java.io.*;
public class CopyFile {
    public static void main(String args[]) throws IOException {
    FileInputStream r=new FileInputStream("A:\\Java programs\\File Handling By Learn Coding\\newfile.txt");
    FileOutputStream w=new FileOutputStream("A:\\Java programs\\File Handling By Learn Coding\\copyfile.txt");
        int i;
        while((i=r.read())!=-1){
            w.write((char)i);

        }
        System.out.println("Data Copied Successfully..!");
      r.close();
      w.close();
    }
}
