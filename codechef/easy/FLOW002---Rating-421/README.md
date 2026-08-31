# FLOW002 - Rating 421

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Find Remainder

Write a program to find the remainder when an integer  **A**  is divided by an integer  **B**.

### Input

The first line contains an integer  **T**, the total number of test cases. Then  **T**  lines follow, each line contains two Integers  **A**  and  **B**.

### Output

For each test case, find the remainder when  **A**  is divided by  **B**, and display it in a new line.

### Constraints
- 1 ≤ T ≤ 1000
- 1 ≤ A,B ≤ 10000
### Sample 1:
Input
Output

```
3 
1 2
100 200
40 15
```

```
1
100
10
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T07:39:54.120Z  

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
	    int valu = a % b;
	    System.out.println(valu);
	}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/FLOW002)