class demo
{
    public static void main(String[] args)
    {
        int n,i,j;
        n=4;
        for(i=1;i<=n;i++)
        {
            for(j=n;j>=1;j--)
            {
                if(j==i || i==n)
                {
                    System.out.print(i);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for(j=2;j<=n;j++)
            {
                if(j==i || i==n)
                {
                    System.out.print(i);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}