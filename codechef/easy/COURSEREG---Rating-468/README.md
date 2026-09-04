# COURSEREG - Rating 468

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-04T12:29:35.148Z  

```java
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
		    int z = sc.nextInt();
		    int p = x * y ;
		    int q = z * 24 * 60;

		    if (p <= q) {
		        System.out.println("YES");
		    } else {
		        System.out.println("NO");
		    }
		    
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/COURSEREG)