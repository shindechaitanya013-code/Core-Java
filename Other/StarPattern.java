
public class StarPattern
{
    public static void main(String args[])
    {
        int i,j,k;

        // Upper part
        for(i=1;i<=3;i++)
        {
            for(j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }

            for(k=1;k<=i;k++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower part
        for(i=2;i>=1;i--)
        {
            for(j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }

            for(k=1;k<=i;k++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
