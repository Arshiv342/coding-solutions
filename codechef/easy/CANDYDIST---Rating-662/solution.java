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
		    int x = sc.nextInt();
		    int k = sc.nextInt();
		    int m = Math.min(n, k / x);
            System.out.println(m);
		}

	}
}
