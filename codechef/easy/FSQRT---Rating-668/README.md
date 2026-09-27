# FSQRT - Rating 668

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-27T03:38:51.398Z  

```java

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    if (n % m == 0 && (n / m) % 2 == 0){
		        System.out.println("Yes");
		        
		    } else {
		        System.out.println("No");
		    }
		}
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/FSQRT)