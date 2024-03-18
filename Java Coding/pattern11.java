import java.util.*;
class pattern11
{
    public static void main(String args[])
    {
        System.out.println("Enter the input");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      for(int i=0;i<n;i++)
      {
        char c= 'A'+ (n-i-1);
        for(int j=0;j<=i;j++)
        {
            System.out.print(c);
            c++;
        }
        System.out.println();

    }
}