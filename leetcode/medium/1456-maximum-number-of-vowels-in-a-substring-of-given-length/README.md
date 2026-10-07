# Maximum Number of Vowels in a Substring of Given Length

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s` and an integer `k`, return  *the maximum number of vowel letters in any substring of* `s` *with length* `k`.

 **Vowel letters**  in English are `'a'`, `'e'`, `'i'`, `'o'`, and `'u'`.

 

 **Example 1:** 

```
Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.

```

 **Example 2:** 

```
Input: s = "aeiou", k = 2
Output: 2
Explanation: Any substring of length 2 contains 2 vowels.

```

 **Example 3:** 

```
Input: s = "leetcode", k = 3
Output: 2
Explanation: "lee", "eet" and "ode" contain 2 vowels.

```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s consists of lowercase English letters.
- 1 <= k <= s.length

## Solution

**Language:** Java  
**Runtime:** 32 ms (beats 5.21%)  
**Memory:** 45.8 MB (beats 98.59%)  
**Submitted:** 2026-10-07T05:44:32.370Z  

```java
class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = Set.of('a','e','i','o','u');
        int count = 0, maxCount = 0;  
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) count++;
        }
        maxCount = count;

        
        for (int i = k; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) count++;
            if (vowels.contains(s.charAt(i - k))) count--;
            maxCount = Math.max(maxCount, count );
        }

        return maxCount;
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/)