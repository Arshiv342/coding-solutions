# HOTCOLD - Rating 410

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Is it hot or cold

Chef considers the climate `HOT` if the temperature is  **above**  $20$, otherwise he considers it `COLD`. You are given the temperature $C$, find whether the climate is `HOT` or `COLD`.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- The first and only line of each test case contains a single integer, the temperature $C$.
### Output Format

For each test case, print on a new line whether the climate is `HOT` or `COLD`.

You may print each character of the string in either uppercase or lowercase (for example, the strings `hOt`, `hot`, `Hot`, and `HOT` will all be treated as identical).

### Constraints
- $1 \leq T \leq 50$
- $0 \leq C \leq 40$
### Sample 1:
Input
Output

```
2
21
16

```

```
HOT
COLD

```

### Explanation:

 **Test case $1$:**  The temperature is $21$, which is more than $20$. So, Chef considers the climate `HOT`.

 **Test case $2$:**  The temperature is $16$, which is not more than $20$. So, Chef considers the climate `COLD`.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T06:10:09.879Z  

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
          
      
      int c = sc.nextInt();
      if( c > 20) {
          System.out.println("HOT");
          
      } else {
          System.out.println("cold");
      }
	}	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/HOTCOLD)