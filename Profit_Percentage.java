import java.util.*;
public class My{
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        float c=b-a;
        float d=(c*100)/a;
        System.out.printf("%.2f",d);
    }
}