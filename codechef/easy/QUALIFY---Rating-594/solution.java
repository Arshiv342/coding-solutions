import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   System.out.println(System.in);
	   int t = sc.nextInt();
	   for(int i =0; i < t; i++) {
	       int x = sc.nextInt();
	       int a = sc.nextInt();
	       int b = sc.nextInt();
	       if(a + b*2 >= x) {
	           System.out.println("Qualify");
	       } else {
	       System.out.println("NotQualify");
	       }
	   }

	}
}
