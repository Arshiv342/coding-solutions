# CARTRIP - Rating 373

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-28T04:28:40.749Z  

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
		     int x1 = sc.nextInt();
		     int y1 = sc.nextInt();
		     int x2 = sc.nextInt();
		     int y2 = sc.nextInt();
		     int cost1 = x1 + y1;
		     int cost2 = x2 + y2;
		     if(cost1<cost2) {
		         System.out.println(cost1);
		     } else {
		         System.out.println(cost2);
		     }
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CARTRIP)