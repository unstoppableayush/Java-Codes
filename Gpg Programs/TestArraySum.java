import java.io.*;
class TestArraySum{
    public static void main(String args[])throws Exception{
        int num[]=new int[10];
        int i;
        int sum=0;
        InputStreamReader ds= new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ds);
        
        System.out.println("Enter 10 integers:");
        for(i=0;i<10;i++)
        {
            num[i]=Integer.parseInt(br.readLine());

        }
        for(i=0;i<10;i++)
        {
            sum=sum+num[i];

        }
        System.out.println(sum);
    }
    

}