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
		    int c = sc.nextInt();
		    int d = sc.nextInt();
		    int f = (a-c);
		    int s = (b-d);
		    if(f < s) {
		        System.out.println("First");
		    } else if ( f > s) {
		        System.out.println("Second");
		    } else {
		        System.out.println("Any");
		    }
		}

	}
}
