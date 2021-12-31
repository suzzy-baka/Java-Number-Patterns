/*OUTPUT:
      1
    1 2 1
  1 2 3 2 1
1 2 3 4 3 2 1
*/

public class Pattern_9
{
    public static void main(String[] args)
    {
        int rows = 4;
        for (int i = 1; i <= rows; i++)
        {
            for (int j = rows; j > i; j--)
            {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print(k + " ");
            }
            for (int l = i - 1; l >= 1; l--)
            {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}