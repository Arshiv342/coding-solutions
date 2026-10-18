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
            long A = sc.nextLong();
            long B = sc.nextLong();
            if (A < B) {
                System.out.println("<");
            } else if (A > B) {
                System.out.println(">");
            } else {
                System.out.println("=");
            }
        }
	}
}
