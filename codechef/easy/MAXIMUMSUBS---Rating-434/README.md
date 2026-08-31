# MAXIMUMSUBS - Rating 434

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T16:03:10.055Z  

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
		    int z = sc.nextInt();
		    if(x>y) {
		        System.out.println("Setter");
		    } else if (y < z) {
		        System.out.println("Editorialist");
		    } else {
		        System.out.println("Tester");
		    }
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MAXIMUMSUBS)