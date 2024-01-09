import java.util.Scanner;
public class My{
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        if(a<=b)
        {
            System.out.println(b);
        }
        else{
            System.out.println(a);
        }
    }
}