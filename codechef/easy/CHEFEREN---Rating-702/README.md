# CHEFEREN - Rating 702

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-01T17:58:52.327Z  

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
		    int s = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int z = sc.nextInt();
		     int p = s - (x + y);

            if (p >= z) {
                System.out.println(0);
            } else if (p + x >= z || p + y >= z) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CHEFEREN)