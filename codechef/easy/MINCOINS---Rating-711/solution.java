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
		    if (x % 5 != 0) {
                System.out.println(-1);
            } else {
                int y = (x / 10) + ((x % 10) / 5);
                System.out.println(y);
            }
		}

	}
}
