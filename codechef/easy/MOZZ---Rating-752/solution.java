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
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int R = sc.nextInt();

            int extra = R / 30;
            int total = (R > 0) ? X + extra : X;
            int plates = (total + Y - 1) / Y; 
            System.out.println(plates);
        }
	}
}
