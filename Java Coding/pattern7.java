import java.util.*;
class pattern7
{
    public static void main(String args[])
    {
        System.out.println("Enter the input");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j+i<n-1;j++)
            System.out.print(" ");

            for(int j=0;j<=2*i+1;j++)
            System.out.print("*");

            for(int j=0;j+i<n-1;j++)
            System.out.print(" ");
        System.out.println();
        }
    }
}