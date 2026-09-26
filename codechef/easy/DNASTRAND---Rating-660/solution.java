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
		    int N = sc.nextInt();
		    String S = sc.next();  

            StringBuilder comp = new StringBuilder();
            for (char c : S.toCharArray()) {
                if (c == 'A') comp.append('T');
                else if (c == 'T') comp.append('A');
                else if (c == 'C') comp.append('G');
                else if (c == 'G') comp.append('C');
            }

            System.out.println(comp.toString());
		}

	}
}
