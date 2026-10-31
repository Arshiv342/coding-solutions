import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().toLowerCase();

        int[] freq = new int[26];

    
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }
        }

        int max = 0;
        char ans = 'a';

        
        for (int i = 0; i < 26; i++) {

            if (freq[i] > max) {
                max = freq[i];
                ans = (char) (i + 'a');
            }
        }

        System.out.println(ans);

	}
}
