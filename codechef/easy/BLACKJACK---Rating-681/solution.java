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
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int x = 21 - (a + b);
		    
            if (x >= 1 && x <= 10) {
                System.out.println(x);
            } else {
                System.out.println(-1);
            }
		}

	}
}
