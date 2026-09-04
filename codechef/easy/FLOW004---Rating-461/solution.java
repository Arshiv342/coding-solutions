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
		    int last =  n % 10;
		    int first = n;
        while (first >= 10) {
            first /= 10;
        }
        System.out.println(first + last);
		}

	}
}
