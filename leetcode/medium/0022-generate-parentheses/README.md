# Generate Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given `n` pairs of parentheses, write a function to  *generate all combinations of well-formed parentheses*.

 

 **Example 1:** 

```
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]

```

 **Example 2:** 

```
Input: n = 1
Output: ["()"]

```

 

 **Constraints:** 

- 1 <= n <= 8

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 14.45%)  
**Memory:** 44.8 MB (beats 43.53%)  
**Submitted:** 2026-10-02T17:33:56.402Z  

```java
import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, String current, int open, int close, int max) {
        
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

       
        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }

        
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/generate-parentheses/)