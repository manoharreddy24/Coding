import java.util.*;
import java.math.*;
class reverse_array
{
    public static void rev(int i, int a[],int n)
    {
       if(i>=n/2)
        return;
      int temp=a[i];
      a[i]=a[n-i-1];
      a[n-i-1]=temp;
      rev(i+1,a,n);
    }
public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    int n;
    n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    rev(0,a,n);
    for(int i=0;i<n;i++)
System.out.print(a[i]);
sc.close();
   }
}