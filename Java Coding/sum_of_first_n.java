import java.util.*;
class sum_of_first_n
{
    public static int sum_n(int n)
    {
        if(n<1)
        return 0;
        return n+sum_n(n-1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sum_n(n);
        System.out.print(a);
    }

}
