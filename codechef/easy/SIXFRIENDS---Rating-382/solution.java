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
      int y = sc.nextInt();
      
      int frinds = Math.min(3*x, 2*y);
      System.out.println(frinds);
  }
	}
}
