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
		    int x = sc.nextInt();
		    int b = sc.nextInt();
		    int y = sc.nextInt();
		     double aliceSpeed = (double) a / x;
            double bobSpeed = (double) b / y;

            if (aliceSpeed > bobSpeed) {
                System.out.println("alice");
            } else if (bobSpeed > aliceSpeed) {
                System.out.println("Bob");
            } else {
                System.out.println("Equal");
            }
		}
		}
}
