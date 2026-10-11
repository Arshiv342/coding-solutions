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
		    int X = sc.nextInt();
            int Y = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();

            Set<Integer> chef = new HashSet<>(Arrays.asList(X, Y));
            Set<Integer> rival = new HashSet<>(Arrays.asList(A, B));

            chef.retainAll(rival); 
            int overlap = chef.size();

            System.out.println(2 - overlap);
		}

	}
}
