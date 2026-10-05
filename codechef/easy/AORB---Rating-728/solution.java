import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int  i = 0; i < t; i++) {
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    int scoreA = 500 - 2 * X;
            int scoreB = 1000 - 4 * (X + Y);
            int total1 = scoreA + scoreB;

          
            int scoreB2 = 1000 - 4 * Y;
            int scoreA2 = 500 - 2 * (X + Y);
            int total2 = scoreB2 + scoreA2;

            System.out.println(Math.max(total1, total2));
		}

	}
}
