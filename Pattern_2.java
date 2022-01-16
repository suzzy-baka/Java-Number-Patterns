/*OUTPUT
         1
       1 2
     1 2 3
   1 2 3 4
 1 2 3 4 5
*/

public class Pattern_2
{
    public static void triangle(int k)
    {
        int a, b;
        for (a = 0; a <= k; a++)
        {
            for (b = 2 * (k - a); b >= 0; b--)
            {
                System.out.print(" ");
            }
            for (b = 1; b <= a; b++)
            {
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int k = 5;
        triangle(k);
    }
}
