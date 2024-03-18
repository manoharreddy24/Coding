class GCD
{
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    for(i=1;i*i<=n1;i++)
    {
        if(n1%i==0 && n2%i==0)
        {
            gcd=i;
            if( n1/i != i && n2%(n1/i)