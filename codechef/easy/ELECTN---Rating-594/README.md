# ELECTN - Rating 594

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T17:06:50.861Z  

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
	   for(int i =0; i < t; i++) {
	       int x = sc.nextInt();
	       int a = sc.nextInt();
	       int b = sc.nextInt();
	       int p = a + 2*b;
	       if(p >= x) {
	           System.out.println("Qualify");
	       } else {
	       System.out.println("NotQualify");
	       }
	   }

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ELECTN)