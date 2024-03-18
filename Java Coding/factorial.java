import java.util.*;
public class factorial {
   public static int fact(int i,int n)
    {
        if(i==n)
            return i;
        else
            return i*fact(i+1,n);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(fact(1,n));
    }
}
