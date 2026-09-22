# DISCUS - Rating 613

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-22T06:06:23.038Z  

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
		    if (n <= 15) {
                if (n == 11 || n == 12 ||  n == 13 || n == 14 || n == 15) {
                    System.out.println("Lower Single");
                } else {
                    System.out.println("Lower Double");
                }
            } else { 
              if (n == 26 || n == 27 || n == 28 || n == 29 || n == 30)  {
                    System.out.println("Upper Single");
                } else {
                    System.out.println("Upper Double");
                }
            }
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DISCUS)