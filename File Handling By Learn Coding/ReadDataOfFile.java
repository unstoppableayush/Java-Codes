import java.io.*;
public class ReadDataOfFile {
    public static void main(String args[])
    {
        try{
            FileReader r=new FileReader("A:\\Java programs\\File Handling By Learn Coding\\newfile.txt");
            try{
                int i;
                while((i=r.read())!=-1)
                {
                    System.out.println((char)i);
                }
            }
            finally{
                r.close();
            }
        }
        catch(IOException e)
        {
            System.out.println("Exception Handled...!");
        }

    }
}
    

