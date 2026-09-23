# FCTRL2 - Rating 646

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T18:42:15.202Z  

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
		    int m = sc.nextInt();
		    int result;
            if (m >= n) {
                result = n;
            } else {
                result = 2 * n - m; 
            }
            
            System.out.println(result);
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/FCTRL2)