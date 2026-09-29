import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();  // number of test cases
        while (T-- > 0) {
            int X1 = sc.nextInt();
            int Y1 = sc.nextInt();
            int X2 = sc.nextInt();
            int Y2 = sc.nextInt();

            int dx = Math.abs(X1 - X2);
            int dy = Math.abs(Y1 - Y2);

            System.out.println(Math.max(dx, dy));
        }

	}
}
