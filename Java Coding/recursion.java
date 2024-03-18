import java.util.*;
class recursion
{
    public static  void func(int i,int n)
    {
        int a;
        if(i>n) 
            return ;
        func(i+1,n);
        System.out.print(i);
        
    }
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    func(1,n);
}
}