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
		    int state = x % 3;
            if (state == 0) {
                System.out.println("NORMAL");
            } else if (state == 1) {
                System.out.println("HUGE");
            } else {
                System.out.println("SMALL");
            }
		}

	}
}
