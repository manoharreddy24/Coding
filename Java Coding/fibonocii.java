import java.util.*;

public class fibonocii {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a1=0,a2=1,ans=0,temp;
        for(int i=3;i<=n;i++)
        {
            ans=a1+a2;
            temp=a2;
            a2=ans;
            a1=temp;
        }
        System.out.print(ans);
    
}
}
