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
            int N = sc.nextInt();

            int ones = 0;

            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                if (x == 1) ones++;
            }

            if (N % 2 != 0) {
                System.out.println(-1);
            } else {
                System.out.println(Math.abs(ones - N / 2));
            }
        }

	}
}
