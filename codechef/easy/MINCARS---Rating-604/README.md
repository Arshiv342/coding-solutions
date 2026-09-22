# MINCARS - Rating 604

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-22T05:22:49.936Z  

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
		while(t-- > 0)
		{
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    int count = 0;
		    for(int i = 0; i < n; i++) {
		        int p = sc.nextInt();
		        if(p >= x) {
		            count++;
		        }
		    }
		    System.out.println(count);
		    
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MINCARS)