import java.util.*;
public class My{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int d=2*a*b*c*512;
        int e=d/1024;
        System.out.printf("%d KB",e);
    }
}