# Scramble String

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

We can scramble a string s to get a string t using the following algorithm:

- If the length of the string is 1, stop.
- If the length of the string is > 1, do the following: Split the string into two non-empty substrings at a random index, i.e., if the string is s, divide it to x and y where s = x + y. Randomly decide to swap the two substrings or to keep them in the same order. i.e., after this step, s may become s = x + y or s = y + x. Apply step 1 recursively on each of the two substrings x and y.

Given two strings `s1` and `s2` of  **the same length**, return `true` if `s2` is a scrambled string of `s1`, otherwise, return `false`.

 

 **Example 1:** 

```
Input: s1 = "great", s2 = "rgeat"
Output: true
Explanation: One possible scenario applied on s1 is:
"great" --> "gr/eat" // divide at random index.
"gr/eat" --> "gr/eat" // random decision is not to swap the two substrings and keep them in order.
"gr/eat" --> "g/r / e/at" // apply the same algorithm recursively on both substrings. divide at random index each of them.
"g/r / e/at" --> "r/g / e/at" // random decision was to swap the first substring and to keep the second substring in the same order.
"r/g / e/at" --> "r/g / e/ a/t" // again apply the algorithm recursively, divide "at" to "a/t".
"r/g / e/ a/t" --> "r/g / e/ a/t" // random decision is to keep both substrings in the same order.
The algorithm stops now, and the result string is "rgeat" which is s2.
As one possible scenario led s1 to be scrambled to s2, we return true.

```

 **Example 2:** 

```
Input: s1 = "abcde", s2 = "caebd"
Output: false

```

 **Example 3:** 

```
Input: s1 = "a", s2 = "a"
Output: true

```

 

 **Constraints:** 

- s1.length == s2.length
- 1 <= s1.length <= 30
- s1 and s2 consist of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 7 ms (beats 73.15%)  
**Memory:** 46.6 MB (beats 69.98%)  
**Submitted:** 2026-09-03T02:24:44.779Z  

```java
import java.util.*;

class Solution {
    Map<String, Boolean> memo = new HashMap<>();
    
    public boolean isScramble(String s1, String s2) {
        if (s1.equals(s2)) return true;
        
        String key = s1 + "|" + s2;
        if (memo.containsKey(key)) return memo.get(key);
        
        
        if (!haveSameChars(s1, s2)) {
            memo.put(key, false);
            return false;
        }
        
        int n = s1.length();
        for (int i = 1; i < n; i++) {
            
            if (isScramble(s1.substring(0, i), s2.substring(0, i)) &&
                isScramble(s1.substring(i), s2.substring(i))) {
                memo.put(key, true);
                return true;
            }
            
            if (isScramble(s1.substring(0, i), s2.substring(n - i)) &&
                isScramble(s1.substring(i), s2.substring(0, n - i))) {
                memo.put(key, true);
                return true;
            }
        }
        
        memo.put(key, false);
        return false;
    }
    
    private boolean haveSameChars(String a, String b) {
        int[] count = new int[26];
        for (char c : a.toCharArray()) count[c - 'a']++;
        for (char c : b.toCharArray()) count[c - 'a']--;
        for (int val : count) if (val != 0) return false;
        return true;
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/scramble-string/)