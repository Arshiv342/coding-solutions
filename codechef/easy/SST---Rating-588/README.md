# SST - Rating 588

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-19T20:31:20.348Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int  t = sc.nextInt();
		for(int i = 0; i < t; i++) {
		    int n = sc.nextInt();
		   int  rev = 0;
		    while(n > 0) {
		        
		    
		    int digit = n % 10;
		    rev = rev * 10 + digit;
		    n /= 10;
		}
         System.out.println(rev);
	}
}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/SST)