import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i = 0; i < t; i++) {
            int W = sc.nextInt(); 
            int X = sc.nextInt(); 
            int Y = sc.nextInt(); 
            int Z = sc.nextInt();
            
            int finalWater = W + (Y * Z);
            
            if (finalWater > X) {
                System.out.println("overflow");
            } else if (finalWater == X) {
                System.out.println("filled");
            } else {
                System.out.println("unfilled");
            }
        }
}
}
	
}
