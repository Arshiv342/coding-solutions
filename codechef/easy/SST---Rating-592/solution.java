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
         int val1 = a * 10;  
            int val2 = b * 5;
            
            if (val1 > val2) {
                System.out.println("FIRST");
            } else if (val2 > val1) {
                System.out.println("SECOND");
            } else {
                System.out.println("ANY");
            }
        }
    

	}
}
