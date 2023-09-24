import java.util.*;
public class AreaOfCircle {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        int r = sc.nextInt();
        int area = r*r;
        System.out.println("Area="+area);
        sc.close();

    }
}
