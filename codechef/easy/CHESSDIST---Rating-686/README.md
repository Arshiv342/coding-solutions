# CHESSDIST - Rating 686

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-28T18:40:10.820Z  

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
	     int z = (x / y) + (x % y);
	     System.out.println(z);
	 }

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CHESSDIST)