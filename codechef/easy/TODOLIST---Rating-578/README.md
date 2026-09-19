# TODOLIST - Rating 578

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-19T09:09:42.532Z  

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
		    int p = sc.nextInt();
		    int q = sc.nextInt();
		    int r = sc.nextInt();
		    int s = sc.nextInt();
		    if(p > q + r + s || q > p + r + s || r > p + q + s || s > p + q + r) {
		        System.out.println("YES");
		        
		    } else {
		        System.out.println("NO");
		    }
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/TODOLIST)