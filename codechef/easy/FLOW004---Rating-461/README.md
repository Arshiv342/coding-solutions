# FLOW004 - Rating 461

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### First and Last Digit

Given an integer  **N** . Write a program to obtain the sum of the first and last digits of this number.

### Input Format

The first line contains an integer  **T**, the total number of test cases. Then follow  **T**  lines, each line contains an integer  **N**.

### Output Format

For each test case, display the sum of first and last digits of  **N**  in a new line.

### Constraints
- $1 \leq T \leq 1000$
- $1 \leq N \leq 1000000$
### Sample 1:
Input
Output

```
3 
1234
124894
242323

```

```
5
5
5
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-04T10:52:52.457Z  

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
		    int last =  n % 10;
		    int first = n;
        while (first >= 10) {
            first /= 10;
        }
        System.out.println(first + last);
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/FLOW004)