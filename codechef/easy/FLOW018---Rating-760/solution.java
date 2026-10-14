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
            long fact = 1;
            for (int i = 2; i <= N; i++) {
                fact *= i;
            }
            System.out.println(fact);
        }
	}
}
