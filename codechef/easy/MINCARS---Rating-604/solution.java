import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    int count = 0;
		    for(int i = 0; i < n; i++) {
		        int p = sc.nextInt();
		        if(p >= x) {
		            count++;
		        }
		    }
		    System.out.println(count);
		    
		}

	}
}
