import java.util.*;
public class My{
    public static void main(String[] args)
    {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a%2==0 && a>2)
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}