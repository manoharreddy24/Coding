import java.util.*;
class pattern9
{
    public static void main(String args[])
    {
        System.out.println("Enter the input");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       for(int i=1;i<=n;i++)
       {
        for(char c='A'; c<='A'+i;c++) 
            System.out.print(c);
        System.out.println();
    }
    }
}