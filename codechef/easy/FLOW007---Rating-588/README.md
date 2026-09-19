# FLOW007 - Rating 588

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Reverse The Number

Given an Integer  **N**, write a program to reverse it.

### Input

The first line contains an integer  **T**, total number of testcases. Then follow  **T**  lines, each line contains an integer  **N**.

### Output

For each test case, display the reverse of the given number  **N**, in a new line.

### Constraints
- 1 ≤ T ≤ 1000
- 1 ≤ N ≤ 1000000
### Sample 1:
Input
Output

```
4
12345
31203
2123
2300
```

```
54321
30213
3212
32
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-19T20:31:10.267Z  

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

[View on CodeChef](https://www.codechef.com/problems/FLOW007)