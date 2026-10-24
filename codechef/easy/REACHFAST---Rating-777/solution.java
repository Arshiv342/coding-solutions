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
            int K = sc.nextInt();

            int distance = Math.abs(A - B);

            int steps = (distance + K - 1) / K;

            System.out.println(steps);
        }


	}
}
