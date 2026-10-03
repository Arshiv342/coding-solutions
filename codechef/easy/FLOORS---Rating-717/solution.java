import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++ ) {
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int a = (x - 1) / 10 + 1;
            int b = (y - 1) / 10 + 1;

            System.out.println(Math.abs(a - b));
		}

	}
}
