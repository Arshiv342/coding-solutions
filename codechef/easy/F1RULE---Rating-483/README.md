# F1RULE - Rating 483

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-04T16:39:53.368Z  

```java
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

```

---

[View on CodeChef](https://www.codechef.com/problems/F1RULE)