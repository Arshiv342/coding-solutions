# BROKENPHONE - Rating 451

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Broken Phone

Uttu broke his phone. He can get it repaired by spending $X$ rupees or he can buy a new phone by spending $Y$ rupees. Uttu wants to spend as little money as possible. Find out if it is better to get the phone repaired or to buy a new phone.

### Input Format
- The first line contains a single integer $T$ — the number of test cases. Then the test cases follow.
- The first and only line of each test case contains two space-separated integers $X$ and $Y$ — the cost of getting the phone repaired and the cost of buying a new phone.
### Output Format

For each test case,

- output REPAIR if it is better to get the phone repaired.
- output NEW PHONE if it is better to buy a new phone.
- output ANY if both the options have the same price.

You may print each character of `REPAIR`, `NEW PHONE` and `ANY` in uppercase or lowercase (for example, `any`, `ANy`, `Any` will be considered identical).

### Constraints
- $1 \leq T \leq 1000$
- $1 \le X, Y \le 10^4$
### Sample 1:
Input
Output

```
3
100 1000
10000 5000
3000 3000

```

```
REPAIR
NEW PHONE
ANY

```

### Explanation:

 **Test Case 1:**  It is better to get the phone repaired since $100 \lt 1000$.

 **Test Case 2:**  It is better to buy a new phone since $10000 \gt 5000$.

 **Test Case 3:**  Uttu can choose either of the two options since $3000 = 3000$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T14:06:24.085Z  

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
		    if(x < y) {
		        System.out.println("REPAIR");
		    } else if( x > y) {
		        System.out.println("NEW PHONE");
		    } else {
		        System.out.println("ANY");
		    }
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/BROKENPHONE)