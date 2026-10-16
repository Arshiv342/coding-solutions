import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
		    int n = sc.nextInt();
		    if (n < 2) {
                System.out.println(0);
            } else {
                System.out.println((n - 2) / 7 + 1);
            }
		}

	}
}
