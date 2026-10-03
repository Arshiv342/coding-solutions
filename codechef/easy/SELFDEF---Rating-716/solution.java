import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
		    int n = sc.nextInt();
		    int count = 0;
            for (int i = 0; i < n; i++) {
                int age = sc.nextInt();
                if (age >= 10 && age <= 60) {
                    count++;
                }
            }
            System.out.println(count);
		}

	}
}
