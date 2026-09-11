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
		    int B1 = sc.nextInt();
            int B2 = sc.nextInt();
            int B3 = sc.nextInt();

            int empty = 0;

            if (B1 == 0) empty++;
            if (B2 == 0) empty++;
            if (B3 == 0) empty++;

            if (empty >= 2) {
                System.out.println("Water filling time");
            } else {
                System.out.println("Not now");
            }
		}

	}
}
