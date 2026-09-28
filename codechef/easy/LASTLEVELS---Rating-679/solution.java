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
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int z = sc.nextInt();
		    int p = x * y;
            int b = x / 3;

            if (x % 3 == 0) {
                b--; 
            }

            p += b * z;
            System.out.println(p);
		}

	}
}
