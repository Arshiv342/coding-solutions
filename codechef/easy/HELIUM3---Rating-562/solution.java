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
            int A = sc.nextInt();
            int B = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if (X * Y >= A * B)
                System.out.println("Yes");
            else
                System.out.println("No");
        }

	}
}
