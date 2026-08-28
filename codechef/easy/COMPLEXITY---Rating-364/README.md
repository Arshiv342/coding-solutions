# COMPLEXITY - Rating 364

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Time Complexity

A sorting algorithm $A$ is said to have more time complexity than a sorting algorithm $B$ if it uses more number of comparisons for sorting the same array than algorithm $B$.

Given that algorithm $A$ uses $X$ comparisons to sort an array and algorithm $B$ uses $Y$ comparisons to sort the same array, find whether algorithm $A$ has more time complexity.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of two space-separated integers $X$ and $Y$ — the number of comparisons used by algorithms $A$ and $B$ to sort the array respectively.
### Output Format

For each test case, output on a new line, `YES`, if the algorithm $A$ has more time complexity than $B$ and `NO` otherwise.

You may print each character of the string in uppercase or lowercase (for example, the strings `YES`, `yEs`, `yes`, and `yeS` will all be treated as identical).

### Constraints
- $1 \leq T \leq 100$
- $1 \leq X, Y \leq 100$
### Sample 1:
Input
Output

```
4
9 9
15 7
10 19
21 20

```

```
NO
YES
NO
YES
```

### Explanation:

 **Test case $1$:**  The number of comparisons used by algorithm $A$ is $9$ and that used by $B$ is also $9$. Since the number of comparisons used by $A$ is not more than that of $B$, $A$ does not have more time complexity than $B$.

 **Test case $2$:**  The number of comparisons used by algorithm $A$ is $15$ and that used by $B$ is $7$. Since the number of comparisons used by $A$ is more than that of $B$, $A$ does have more time complexity than $B$.

 **Test case $3$:**  The number of comparisons used by algorithm $A$ is $10$ and that used by $B$ is $19$. Since the number of comparisons used by $A$ is not more than that of $B$, $A$ does not have more time complexity than $B$.

 **Test case $4$:**  The number of comparisons used by algorithm $A$ is $21$ and that used by $B$ is $20$. Since the number of comparisons used by $A$ is more than that of $B$, $A$ does have more time complexity than $B$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-28T03:47:51.044Z  

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
		    
		    if(x<=y) {
		        System.out.println("NO");
		    } else {
		        System.out.println("YES");
		    }
		}
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/COMPLEXITY)