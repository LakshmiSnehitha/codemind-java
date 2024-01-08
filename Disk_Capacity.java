import java.util.*;
public class My{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int d=a*b*c*2*512;
        System.out.printf("%d",d);
    }
}