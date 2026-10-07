# POLYBAGS - Rating 735

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-07T09:53:55.605Z  

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
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    int d = sc.nextInt();
		    if(a + c == 180 && b + d == 180) {
		        System.out.println( "YES");
		        
		    } else {
		        System.out.println("NO");
		}
		}
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/POLYBAGS)