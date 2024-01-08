import java.util.Scanner;
public class My{
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        double c=(a+b)/2.0;
        System.out.printf("%.4f",c);
    }
}