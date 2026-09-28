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
		    int k = sc.nextInt();
		    int m = sc.nextInt();
		    int x = k * m;
		    int y = ( n + x - 1) / x;
		    System.out.println(y);
		}

	}
}
