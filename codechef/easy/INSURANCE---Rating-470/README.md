# INSURANCE - Rating 470

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-04T13:25:17.220Z  

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
		for(int i = 0; i < t; i++)  {
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    int k = sc.nextInt();
		   
		    if(n + k <= m) {
		        System.out.println("Yes");
		    } else {
		        System.out.println("No");
		    }
		}
		    

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/INSURANCE)