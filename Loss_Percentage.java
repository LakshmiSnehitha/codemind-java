import java.util.Scanner;
public class My{
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     int a,b;
     a=sc.nextInt();
     b=sc.nextInt();
     float c=(a-b);
     float d=(c*100)/a;
     System.out.printf("%.2f",d);
    }
}