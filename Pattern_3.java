/*OUTPUT:
        1
      2 2
    3 3 3
  4 4 4 4
5 5 5 5 5
*/

public class Pattern_3
{
    public static void main(String args[])
    {
        int i,j,k,n;
        n=5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}