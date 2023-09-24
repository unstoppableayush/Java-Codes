import java.io.*;
public class MatrixMultiplictaion
{
    public static void main(String[] args) throws Exception 
	{
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];
		
        InputStreamReader ip = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ip);
		
        System.out.println("Enter the values of Matrix1:");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                a[i][j]=Integer.parseInt(br.readLine());
            }
        }
		
        System.out.println("Enter the values of Matrix2:");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                b[i][j]=Integer.parseInt(br.readLine());
            }
        }
		
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                c[i][j]=0;
            }
        }
		
        System.out.println("Multiplication=");
        for (int i=0;i<3;i++)
		{
            for (int j=0;j<3;j++)
			{
                for (int k=0;k<3;k++)
				{
                    c[i][j]= c[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        for (int i=0;i<3;i++)
		{
            for (int j=0;j<3;j++)
			{
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}