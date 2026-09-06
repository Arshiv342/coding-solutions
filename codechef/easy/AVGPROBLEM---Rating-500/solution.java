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
         double avg = (a + b ) / 2.0;
         if(avg > c) {
         System.out.println("YES");
         
          } else {
              System.out.println("NO");
          }
     }
	}
}
