# DOMINANT - Rating 487

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-04T16:40:20.785Z  

```java
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            
            
            if (Y <= 1.07 * X) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DOMINANT)