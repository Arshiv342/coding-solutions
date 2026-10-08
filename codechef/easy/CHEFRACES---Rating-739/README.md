# CHEFRACES - Rating 739

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-08T04:52:27.782Z  

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
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    double c = (double) a/x;
		    double d = (double) b/y;
		    if(c < d) {
		        System.out.println("Chef");
		    } else if(d < c) {
		        System.out.println("Chefina");
		    } else {
		        System.out.println("Both");
		    }
}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CHEFRACES)