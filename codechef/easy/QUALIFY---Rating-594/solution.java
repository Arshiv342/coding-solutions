import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner sc = new Scanner(System.in);
	   int t = sc.nextInt();
	   for(int i =0; i < t; i++) {
	       int x = sc.nextInt();
	       int a = sc.nextInt();
	       int b = sc.nextInt();
	       int p = a + 2*b;
	       if(p >= x) {
	           System.out.println("Qualify");
	       } else {
	       System.out.println("NotQualify");
	       }
	   }

	}
}
