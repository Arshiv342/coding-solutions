import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int H = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();

            int withoutSpecial = (H + X - 1) / X;

            int withSpecial;
            if (H <= Y) {
                withSpecial = 1;
            } else {
                withSpecial = 1 + (H - Y + X - 1) / X;
            }

            System.out.println(Math.min(withoutSpecial, withSpecial));
        }

	}
}
