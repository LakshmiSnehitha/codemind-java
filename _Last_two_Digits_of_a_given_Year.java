import java.util.*;
public class My{
    public static void main(String[] args)
    {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        int b=a%100;
        if(b<=9)
        {
            System.out.printf("0%d",b);
        }
        else
        {
        System.out.println(b);
    }
    }
}