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
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    double c = (double) a/x;
		    double d = (double) b/y;
		    if(c < d) {
		        System.out.println("Chef");
		    } else if(d < c) {
		        System.out.println("Chefina");
		    } else {
		        System.out.println("Both");
		    }
}

	}
}
