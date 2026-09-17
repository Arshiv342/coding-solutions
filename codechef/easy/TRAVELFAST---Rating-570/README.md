# TRAVELFAST - Rating 570

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-17T18:34:07.889Z  

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
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    int y = Math.max(0, n - x);
		    System.out.println((y + 3) / 4);
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/TRAVELFAST)