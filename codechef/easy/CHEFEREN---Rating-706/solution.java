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
	     int n = sc.nextInt();
	     int a = sc.nextInt();
	     int b = sc.nextInt();
	     
            int x = (n + 1) / 2;  
            int y = n / 2;       

            int z = x * b + y * a;
            System.out.println(z);
	     
	 }

	}
}
