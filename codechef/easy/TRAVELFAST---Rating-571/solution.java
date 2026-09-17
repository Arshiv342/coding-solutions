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
		    if(x<y) {
		        System.out.println("BIKE");
		        
		    } else if (y < x) {
		        System.out.println("CAR");
		        
		    } else {
		        System.out.println("SAME");
		    }
		}

	}
}
