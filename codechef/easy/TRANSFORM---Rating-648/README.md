# TRANSFORM - Rating 648

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Small factorials

You are asked to calculate factorials of some small positive integers.

### Input

An integer t, 1<=t<=100, denoting the number of testcases, followed by t lines, each containing a single integer n, 1 <= n <= 100

### Output

For each integer n given at input, display a line with the value of n!

 **Note:**  For larger numbers, their factorial can overflows any available numeric data type in C.

### Sample 1:
Input
Output

```
4
1
2
5
3
```

```
1
2
120
6
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T17:58:31.610Z  

```java
import java.util.*;
import java.math.BigInteger;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();  // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();
            BigInteger fact = BigInteger.ONE;

            for (int i = 2; i <= n; i++) {
                fact = fact.multiply(BigInteger.valueOf(i));
            }

            System.out.println(fact);
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/TRANSFORM)