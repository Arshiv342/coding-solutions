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
		    if(x <= 3) {
		        System.out.println("BRONZE");
		        
		    } else if (x>3 &&x <= 6) {
		        System.out.println("SILVER");
		        
		    } else {
		        System.out.println("GOLD");
		    }
		}

	}
}
